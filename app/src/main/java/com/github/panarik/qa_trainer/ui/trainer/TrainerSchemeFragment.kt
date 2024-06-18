package com.github.panarik.qa_trainer.ui.trainer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.panarik.qa_trainer.databinding.FragmentTrainerShemeBinding
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerItemAdapter
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerScheme
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerTopic

class TrainerSchemeFragment : Fragment() {

    private var binding: FragmentTrainerShemeBinding? = null
    private val model: TrainerSchemeViewModel by lazy { ViewModelProvider(this)[TrainerSchemeViewModel::class.java] }

    override fun onCreateView(inf: LayoutInflater, con: ViewGroup?, state: Bundle?): View {
        binding = FragmentTrainerShemeBinding.inflate(inf, con, false)
        binding!!.recyclerView.let {
            it.setHasFixedSize(true)
            it.layoutManager = LinearLayoutManager(this.context)
            it.adapter = TrainerItemAdapter(getTopics())
        }
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.init(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun showTrainer(trainerScheme: TrainerScheme?) {
        if (trainerScheme != null) {
            binding?.trainerName?.text = trainerScheme.name
        }
    }

    private fun getTopics(): List<TrainerTopic> =
        listOf(
            TrainerTopic("Trainer topic 1", "Topic 1 Description", 1),
            TrainerTopic("Trainer topic 2", "Topic 2 Description")
        )
}