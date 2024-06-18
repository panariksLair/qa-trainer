package com.github.panarik.qa_trainer.ui.trainer.model

data class TrainerTopic(
    val name: String,
    val desc: String,
    val status: Int = 0,
    var hasExpand: Boolean = false
)
