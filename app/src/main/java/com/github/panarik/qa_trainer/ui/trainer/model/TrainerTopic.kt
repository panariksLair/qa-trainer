package com.github.panarik.qa_trainer.ui.trainer.model

data class TrainerTopic(
    val name: String,
    val status: Int,
    val desc: String,
    var isExpandable: Boolean = false
)
