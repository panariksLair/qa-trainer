package com.github.panarik.qa_trainer.ui.trainer.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
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
        holder.binding.trainerTopicStatusImage.setImageResource(topic.status)
        holder.binding.trainerTopicName.text = topic.name
        holder.binding.trainerTopicDescription.text = topic.desc
        holder.binding.trainerTopicDescription.visibility =
            if (topic.isExpandable) View.VISIBLE else View.GONE
        holder.binding.trainerTopicSummary.setOnClickListener {
            isAnyItemExpanded(position)
            topic.isExpandable = !topic.isExpandable
            notifyItemChanged(position, Unit)
        }
    }

    private fun isAnyItemExpanded(position: Int) {
        val temp = topics.indexOfFirst {
            it.isExpandable
        }
        if (temp >= 0 && temp != position) {
            topics[temp].isExpandable = false
            notifyItemChanged(temp, 0)
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
}