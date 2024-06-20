package com.github.panarik.qa_trainer.ui.trainer.body

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.github.panarik.qa_trainer.databinding.FragmentTrainerBodyBinding
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerItem
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerItemImage
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerItemTextBlock
import com.github.panarik.qa_trainer.ui.trainer.model.TrainerItemTitle

class TrainerBodyFragment : Fragment() {

    private var binding: FragmentTrainerBodyBinding? = null
    private val model: TrainerBodyViewModel by lazy {
        ViewModelProvider(this)[TrainerBodyViewModel::class.java].init(this)
    }

    override fun onCreateView(inf: LayoutInflater, con: ViewGroup?, state: Bundle?): View? {
        binding = FragmentTrainerBodyBinding.inflate(inf, con, false)
        return binding!!.root
    }

    override fun onViewCreated(viewRoot: View, savedInstanceState: Bundle?) {
        super.onViewCreated(viewRoot, savedInstanceState)
        createTrainerView(model.getTrainerItems())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun createTrainerView(items: List<TrainerItem>) {
        val layout = binding?.trainerBodyLayout
        items.forEachIndexed { index, view ->
            when (view) {

                is TrainerItemTitle -> layout?.addView(TextView(context).apply {
                    text = view.text
                    setTextColor(Color.BLACK)
                    textSize = 32F
                })

                is TrainerItemImage -> layout?.addView(ImageView(context).apply {
                    setImageResource(view.resId)
                })

                is TrainerItemTextBlock -> layout?.addView(TextView(context).apply {
                    text = view.text
                    setTextColor(Color.BLACK)
                    textSize = 16F
                })
            }
        }
    }
}