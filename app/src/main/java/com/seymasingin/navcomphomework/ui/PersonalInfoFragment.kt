package com.seymasingin.navcomphomework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.seymasingin.navcomphomework.R
import com.seymasingin.navcomphomework.data.PersonalInfo
import com.seymasingin.navcomphomework.databinding.FragmentPersonalInfoBinding


class PersonalInfoFragment : Fragment() {

    lateinit var binding : FragmentPersonalInfoBinding
    private val args by navArgs<PersonalInfoFragmentArgs>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentPersonalInfoBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.InfoName.text = args.name


        binding.infoButton.setOnClickListener {
            val info = PersonalInfo(binding.InfoName.text.toString(),
                                    binding.emailInfo.text.toString(),
                                    binding.phoneInfo.text.toString().toInt())
            val action = PersonalInfoFragmentDirections.infoToQuestion(info)
            findNavController().navigate(action)
        }
    }

}