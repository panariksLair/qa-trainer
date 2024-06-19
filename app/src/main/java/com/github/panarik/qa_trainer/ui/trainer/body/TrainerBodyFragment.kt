package com.github.panarik.qa_trainer.ui.trainer.body

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.github.panarik.qa_trainer.R
import com.github.panarik.qa_trainer.databinding.FragmentTrainerBodyBinding

class TrainerBodyFragment : Fragment() {

    private var binding: FragmentTrainerBodyBinding? = null
    private val viewModel by lazy {
        ViewModelProvider(this)[TrainerBodyViewModel::class.java].init(
            this
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_trainer_body, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}