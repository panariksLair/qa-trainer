package com.github.panarik.qa_trainer.ui.home.model

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.panarik.qa_trainer.databinding.HomeItemsRowBinding
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerScheme

class TrainersAdapter(
    private val trainers: List<TrainerScheme>,
    private val listener: (Int) -> Unit
) :
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
        holder.binding.homeTrainerImage.setImageResource(trainers[position].logoId)
        holder.binding.homeTrainerName.text = trainers[position].name
        holder.binding.homeItemCardView.setOnClickListener {
            Log.d("Adapter", "Home item $position is clicked.")
            listener(position)
        }
    }
}

