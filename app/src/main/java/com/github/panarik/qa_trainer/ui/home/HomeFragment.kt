package com.github.panarik.qa_trainer.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.panarik.qa_trainer.databinding.FragmentHomeBinding
import com.github.panarik.qa_trainer.ui.home.model.TrainerModel
import com.github.panarik.qa_trainer.ui.home.model.TrainersAdapter

class HomeFragment : Fragment() {

    private val model: HomeViewModel by lazy { ViewModelProvider(this)[HomeViewModel::class.java] }
    private lateinit var binding: FragmentHomeBinding

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
            it.adapter = TrainersAdapter(trainers)
            it.layoutManager = LinearLayoutManager(this.context)
        }
    }

}