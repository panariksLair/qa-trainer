package com.github.panarik.qa_trainer.ui.home.model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.panarik.qa_trainer.databinding.HomeItemsRowBinding

class TrainersAdapter(private val trainers: List<TrainerModel>) :
    RecyclerView.Adapter<TrainersAdapter.TrainerViewHolder>() {

    class TrainerViewHolder(val binding: HomeItemsRowBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainerViewHolder =
        TrainerViewHolder(
            HomeItemsRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun getItemCount(): Int = trainers.size

    override fun onBindViewHolder(holder: TrainerViewHolder, position: Int) {
        holder.binding.homeText1.text = trainers[position].name
    }
}

