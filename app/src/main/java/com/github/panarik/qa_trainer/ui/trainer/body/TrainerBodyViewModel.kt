package com.github.panarik.qa_trainer.ui.trainer.body

import androidx.lifecycle.ViewModel

class TrainerBodyViewModel : ViewModel() {

    lateinit var fragment: TrainerBodyFragment

    fun init(fragment: TrainerBodyFragment) {
        this.fragment = fragment
    }

}