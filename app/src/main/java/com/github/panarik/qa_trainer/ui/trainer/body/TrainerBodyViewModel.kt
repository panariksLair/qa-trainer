package com.github.panarik.qa_trainer.ui.trainer.body

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModel
import com.github.panarik.qa_trainer.R

class TrainerBodyViewModel : ViewModel() {

    lateinit var fragment: TrainerBodyFragment

    fun init(fragment: TrainerBodyFragment): TrainerBodyViewModel {
        this.fragment = fragment
        return this
    }

    fun getTrainerItems(): List<View> =
        listOf(
            TextView(fragment.context).apply { text = "Text 1" },
            ImageView(fragment.context).apply { setImageResource(R.drawable.trainer_item_testrail_logo) },
            TextView(fragment.context).apply { text = "Text 2" }
        )

}