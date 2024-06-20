package com.github.panarik.qa_trainer.ui.trainer.model

import java.io.Serializable

data class TrainerScheme(
    val name: String,
    val logoId: Int,
    val bannerId: Int,
    val topics: List<TrainerTopic>
) :
    Serializable