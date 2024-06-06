package com.github.panarik.qa_trainer.ui.about_app


import androidx.lifecycle.ViewModel

class AboutAppViewModel : ViewModel() {

    private lateinit var fragment: AboutAppFragment

    fun init(fragment: AboutAppFragment) {
        this.fragment = fragment
    }

}