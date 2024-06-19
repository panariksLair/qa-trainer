package com.github.panarik.qa_trainer.ui.trainer.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.panarik.qa_trainer.R
import com.github.panarik.qa_trainer.databinding.TrainerSchemeItemBinding

class TrainerItemAdapter(private var topics: List<TrainerTopic>, private val listener: (Int) -> Unit) :
    RecyclerView.Adapter<TrainerItemAdapter.TrainerItemViewHolder>() {

    inner class TrainerItemViewHolder(val binding: TrainerSchemeItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainerItemViewHolder =
        TrainerItemViewHolder(
            TrainerSchemeItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: TrainerItemViewHolder, position: Int) {
        val topic = topics[position]
        updateTopic(holder, topic)
        holder.binding.trainerTopicExpanded.setOnClickListener {
            hideOtherDescriptions(position)
            topic.hasExpand = !topic.hasExpand // switch current topic description
            notifyItemChanged(position)
        }
        holder.binding.trainerTopicSummary.setOnClickListener{
            listener(position)
        }
    }

    override fun getItemCount(): Int {
        return topics.size
    }

    private fun updateTopic(holder: TrainerItemViewHolder, topic: TrainerTopic) {
        holder.binding.trainerTopicStatusImage.setImageResource(getStatus(topic.status))
        holder.binding.trainerTopicName.text = topic.name
        holder.binding.trainerTopicDescription.text = topic.desc
        holder.binding.trainerTopicDescription.visibility =
            if (topic.hasExpand) View.VISIBLE else View.GONE
        holder.binding.trainerTopicExpanded.setImageResource(
            if (topic.hasExpand) R.drawable.trainer_item_arrow_up_24 else R.drawable.trainer_item_arrow_down_24
        )
    }

    private fun hideOtherDescriptions(position: Int) {
        topics.forEachIndexed { index, topic ->
            if (index != position && topic.hasExpand) {
                topics[index].hasExpand = false
                notifyItemChanged(index)
            }
        }
    }

    private fun getStatus(topic: Int): Int =
        when (topic) {
            0 -> R.drawable.trainer_item_box_unchecked_24
            1 -> R.drawable.trainer_item_box_checked_24
            else -> R.drawable.ic_launcher_foreground
        }
}