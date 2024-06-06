package com.github.panarik.qa_trainer.ui.test_cases

import androidx.lifecycle.ViewModel

class TestCasesViewModel : ViewModel() {

    private lateinit var fragment: TestCasesFragment

    fun init(fragment: TestCasesFragment) {
        this.fragment = fragment
    }

}