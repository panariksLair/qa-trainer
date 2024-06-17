package com.github.panarik.qa_trainer.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.panarik.qa_trainer.R
import com.github.panarik.qa_trainer.databinding.FragmentHomeBinding
import com.github.panarik.qa_trainer.ui.home.model.TrainerModel
import com.github.panarik.qa_trainer.ui.home.model.TrainersAdapter
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerScheme

private const val TAG = "HomeFragment"

class HomeFragment : Fragment() {

    private val model: HomeViewModel by lazy { ViewModelProvider(this)[HomeViewModel::class.java] }
    private lateinit var binding: FragmentHomeBinding
    private val trainersScheme = listOf(
        TrainerScheme("TMS Trainer scheme", listOf("first topic", "second topic", "third topic"))
    )

    override fun onCreateView(inf: LayoutInflater, con: ViewGroup?, state: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inf, con, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.init(this)
    }

    fun createTrainers(trainers: List<TrainerModel>) {
        binding.homeItemsRecycleView.let {
            it.adapter = TrainersAdapter(trainers) { item ->
                Log.d(TAG, "Item $item is clicked.")
                startTrainerFragment(trainersScheme[item])
            }
            it.layoutManager = LinearLayoutManager(this.context)
        }
    }

    private fun startTrainerFragment(trainerScheme: TrainerScheme) {
        Log.d(TAG, "Start new fragment with trainer ${trainerScheme.name}")
        val bundle = Bundle().apply { putSerializable("TrainerScheme", trainerScheme) }
        Navigation.findNavController(binding.root)
            .navigate(R.id.action_nav_home_fragment_to_trainerSchemeFragment, bundle)
    }

}