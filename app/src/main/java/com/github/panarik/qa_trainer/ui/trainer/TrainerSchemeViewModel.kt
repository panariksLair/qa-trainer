package com.github.panarik.qa_trainer.ui.trainer

import androidx.lifecycle.ViewModel
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerScheme

class TrainerSchemeViewModel : ViewModel() {

    private lateinit var fragment: TrainerSchemeFragment

    fun init(fragment: TrainerSchemeFragment) {
        val trainer = fragment.arguments?.getSerializable("TrainerScheme") as TrainerScheme?
        fragment.showTrainer(trainer)
        this.fragment = fragment
    }
}