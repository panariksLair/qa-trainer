package com.github.panarik.qa_trainer.ui.trainer.scheme

import androidx.lifecycle.ViewModel
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerScheme

class TrainerSchemeViewModel : ViewModel() {

    private lateinit var fragment: TrainerSchemeFragment
    var trainer: TrainerScheme? = null

    fun init(fragment: TrainerSchemeFragment) {
        trainer = fragment.arguments?.getSerializable("TrainerScheme") as TrainerScheme?
        fragment.showTrainer(trainer)
        this.fragment = fragment
    }
}