package com.github.panarik.qa_trainer.ui.trainer.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.panarik.qa_trainer.R
import com.github.panarik.qa_trainer.databinding.TrainerSchemeItemBinding

class TrainerItemAdapter(private var topics: List<TrainerTopic>) :
    RecyclerView.Adapter<TrainerItemAdapter.TrainerItemViewHolder>() {

    inner class TrainerItemViewHolder(val binding: TrainerSchemeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun collapseExpandedView() {
            binding.trainerTopicDescription.visibility = View.GONE
        }
    }

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
        holder.binding.trainerTopicStatusImage.setImageResource(getStatus(topic.status))
        holder.binding.trainerTopicName.text = topic.name
        holder.binding.trainerTopicDescription.text = topic.desc
        holder.binding.trainerTopicDescription.visibility =
            if (topic.hasExpand) View.VISIBLE else View.GONE
        holder.binding.trainerTopicSummary.setOnClickListener {
            hideOtherDescriptions(position)
            topic.hasExpand = !topic.hasExpand // switch current topic description
            notifyItemChanged(position)
        }
    }

    override fun onBindViewHolder(
        holder: TrainerItemViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        if (payloads.isNotEmpty() && payloads[0] == 0) {
            holder.collapseExpandedView()
        } else {
            super.onBindViewHolder(holder, position, payloads)
        }
    }

    override fun getItemCount(): Int {
        return topics.size
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