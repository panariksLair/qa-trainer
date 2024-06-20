package com.github.panarik.qa_trainer.ui.trainer.body

import androidx.lifecycle.ViewModel
import com.github.panarik.qa_trainer.R
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerItem
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerItemImage
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerItemTextBlock
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerItemTitle

class TrainerBodyViewModel : ViewModel() {

    lateinit var fragment: TrainerBodyFragment

    fun init(fragment: TrainerBodyFragment): TrainerBodyViewModel {
        this.fragment = fragment
        return this
    }

    fun getTrainerItems(): List<TrainerItem> = listOf(
        TrainerItemTitle("Title 1"),
        TrainerItemImage(R.drawable.trainer_item_testrail_logo),
        TrainerItemTextBlock("Some text block to explain current topic.")
    )

}