package com.github.panarik.qa_trainer.ui.trainer.scheme

import androidx.lifecycle.ViewModel
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerScheme
import com.github.panarik.qa_trainer.ui.trainer.scheme.TrainerSchemeFragment

class TrainerSchemeViewModel : ViewModel() {

    private lateinit var fragment: TrainerSchemeFragment

    fun init(fragment: TrainerSchemeFragment) {
        val trainer = fragment.arguments?.getSerializable("TrainerScheme") as TrainerScheme?
        fragment.showTrainer(trainer)
        this.fragment = fragment
    }
}