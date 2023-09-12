package com.seymasingin.navcomphomework.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.seymasingin.navcomphomework.data.AllInfo
import com.seymasingin.navcomphomework.data.PersonalInfo
import com.seymasingin.navcomphomework.databinding.FragmentQuestionsBinding



class QuestionsFragment : Fragment() {

    lateinit var binding : FragmentQuestionsBinding
    private val args by navArgs<QuestionsFragmentArgs>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentQuestionsBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.infoNameQuestion.text = args.info.name

        binding.buttonQuestion.setOnClickListener {
            val email = args.info.email
            val phone = args.info.phone
            val name = args.info.name
            val job = binding.jobText.text.toString()
            val place = binding.placeText.text.toString()
            val age = binding.ageText.text.toString().toInt()
            val data= AllInfo(PersonalInfo(name,email,phone), job, place, age)
            val action = QuestionsFragmentDirections.quesToResult(data)
            findNavController().navigate(action)
        }
    }
}