package com.github.panarik.qa_trainer.ui.main.theory


import androidx.lifecycle.ViewModel

class TheoryViewModel : ViewModel() {

    private lateinit var fragment: TheoryFragment

    fun init(fragment: TheoryFragment) {
        this.fragment = fragment
    }

}