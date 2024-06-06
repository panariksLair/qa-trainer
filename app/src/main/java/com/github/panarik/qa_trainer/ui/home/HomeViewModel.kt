package com.github.panarik.qa_trainer.ui.home

import androidx.lifecycle.ViewModel
import com.github.panarik.qa_trainer.ui.home.model.TrainerModel

class HomeViewModel : ViewModel() {

    private lateinit var fragment: HomeFragment
    private val trainers = listOf(TrainerModel("Trainer 1"), TrainerModel("Trainer 2"), TrainerModel("Trainer 3"))

    fun init(fragment: HomeFragment) {
        this.fragment = fragment
        fragment.createTrainers(trainers)
    }
}