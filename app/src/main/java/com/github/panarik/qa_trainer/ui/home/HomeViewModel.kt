package com.github.panarik.qa_trainer.ui.home

import androidx.lifecycle.ViewModel
import com.github.panarik.qa_trainer.R
import com.github.panarik.qa_trainer.ui.home.model.TrainerModel
import com.github.panarik.qa_trainer.ui.trainer.model.Trainers

class HomeViewModel : ViewModel() {

    private lateinit var fragment: HomeFragment

    fun init(fragment: HomeFragment) {
        this.fragment = fragment
        fragment.createTrainers(Trainers.data)
    }
}