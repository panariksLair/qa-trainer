package com.github.panarik.qa_trainer.ui.trainer.body

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.github.panarik.qa_trainer.databinding.FragmentTrainerBodyBinding

class TrainerBodyFragment : Fragment() {

    private var binding: FragmentTrainerBodyBinding? = null
    private val model: TrainerBodyViewModel by lazy {
        ViewModelProvider(this)[TrainerBodyViewModel::class.java].init(this)
    }

    override fun onCreateView(inf: LayoutInflater, con: ViewGroup?, state: Bundle?): View? {
        binding = FragmentTrainerBodyBinding.inflate(inf, con, false)
        return binding!!.root
    }

    override fun onViewCreated(viewRoot: View, savedInstanceState: Bundle?) {
        super.onViewCreated(viewRoot, savedInstanceState)
        val layout = binding?.trainerBodyLayout
        model.getTrainerItems().forEachIndexed { index, view ->
            layout?.addView(view, index)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}