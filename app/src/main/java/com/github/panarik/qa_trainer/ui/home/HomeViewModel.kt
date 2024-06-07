package com.github.panarik.qa_trainer.ui.home

import androidx.lifecycle.ViewModel
import com.github.panarik.qa_trainer.R
import com.github.panarik.qa_trainer.ui.home.model.TrainerModel

class HomeViewModel : ViewModel() {

    private lateinit var fragment: HomeFragment
    private val trainers = listOf(TrainerModel(R.drawable.home_item_tms_image, "TMS"))

    fun init(fragment: HomeFragment) {
        this.fragment = fragment
        fragment.createTrainers(trainers)
    }
}