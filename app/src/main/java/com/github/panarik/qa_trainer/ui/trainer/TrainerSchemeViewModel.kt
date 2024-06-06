package com.github.panarik.qa_trainer.ui.trainer

import androidx.lifecycle.ViewModel

class TrainerSchemeViewModel : ViewModel() {

    private lateinit var fragment: TrainerSchemeFragment

    fun init(fragment: TrainerSchemeFragment) {
        this.fragment = fragment
    }
}