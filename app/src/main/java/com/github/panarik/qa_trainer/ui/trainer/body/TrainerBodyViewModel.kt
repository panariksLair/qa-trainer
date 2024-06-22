package com.github.panarik.qa_trainer.ui.trainer.body

import androidx.lifecycle.ViewModel
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerScheme
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerTopic

class TrainerBodyViewModel : ViewModel() {

    lateinit var fragment: TrainerBodyFragment
    private lateinit var trainerScheme: TrainerScheme
    private var trainerPosition = 0

    fun init(fragment: TrainerBodyFragment): TrainerBodyViewModel {
        this.fragment = fragment
        val bundle = fragment.arguments
        this.trainerScheme = bundle?.getSerializable("trainerBody") as TrainerScheme
        this.trainerPosition = bundle.getInt("trainerPosition")
        return this
    }

    fun getTrainerItems(): TrainerTopic = trainerScheme.topics[trainerPosition]

}