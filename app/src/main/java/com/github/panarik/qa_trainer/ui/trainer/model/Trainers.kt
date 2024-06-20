package com.github.panarik.qa_trainer.ui.trainer.model

import com.github.panarik.qa_trainer.R

object Trainers {

    val data = listOf(
        TrainerScheme(
            "TMS",
            R.drawable.home_item_tms_image,
            R.drawable.trainer_item_testrail_logo,
            listOf(
                TrainerTopic(
                    "Topic name 1", "Topic description 1",
                    listOf(
                        TrainerItemTitle("First title"),
                        TrainerItemImage(R.drawable.trainer_item_testrail_logo),
                        TrainerItemTextBlock("Trainer test block that explains steps")
                    )
                )
            )
        )
    )

}