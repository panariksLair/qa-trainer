package com.github.panarik.qa_trainer.ui.trainer.scheme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.panarik.qa_trainer.R
import com.github.panarik.qa_trainer.databinding.FragmentTrainerShemeBinding
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerItemAdapter
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerScheme

class TrainerSchemeFragment : Fragment() {

    private var binding: FragmentTrainerShemeBinding? = null
    private val model: TrainerSchemeViewModel by lazy { ViewModelProvider(this)[TrainerSchemeViewModel::class.java] }

    override fun onCreateView(inf: LayoutInflater, con: ViewGroup?, state: Bundle?): View {
        binding = FragmentTrainerShemeBinding.inflate(inf, con, false)
        model.init(this)
        return binding!!.root
    }

    private fun openTrainerBodyFragment(position: Int) {
        val bundle = Bundle().apply { putInt("position", position) }
        binding?.let {
            Navigation.findNavController(it.root)
                .navigate(R.id.action_trainerSchemeFragment_to_trainerBodyFragment, bundle)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    fun showTrainer(trainerScheme: TrainerScheme?) {
        if (trainerScheme != null) {
            binding!!.trainerTopics.let {
                it.setHasFixedSize(true)
                it.layoutManager = LinearLayoutManager(this.context)
                it.adapter = TrainerItemAdapter(trainerScheme.topics) { position ->
                    openTrainerBodyFragment(position)
                }
            }
            binding?.trainerName?.text = trainerScheme.name
            binding?.trainerBanner?.setImageResource(trainerScheme.bannerId)
        }
    }

}