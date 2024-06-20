package com.github.panarik.qa_trainer.ui.trainer.model

import java.io.Serializable

data class TrainerTopic(
    val name: String,
    val desc: String,
    val steps: List<TrainerItem>,
    val status: Int = 0,
    var hasExpand: Boolean = false
) : Serializable
