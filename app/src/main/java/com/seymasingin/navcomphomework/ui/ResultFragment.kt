package com.seymasingin.navcomphomework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.seymasingin.navcomphomework.R
import com.seymasingin.navcomphomework.data.AllInfo
import com.seymasingin.navcomphomework.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    private  lateinit var binding: FragmentResultBinding
    private val args by navArgs<ResultFragmentArgs>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentResultBinding.inflate(inflater,container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            resultName.text = args.allInfo.personalInfo.name
            phoneResult.text= args.allInfo.personalInfo.phone.toString()
            emailResult.text = args.allInfo.personalInfo.email
            jobResult.text = args.allInfo.job
            placeResult.text= args.allInfo.place
            ageResult.text= args.allInfo.age.toString()
            resultButton.setOnClickListener {
                findNavController().navigate(R.id.resultToRegister)
            }
        }
    }
}