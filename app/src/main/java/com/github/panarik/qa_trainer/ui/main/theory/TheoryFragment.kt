package com.github.panarik.qa_trainer.ui.main.theory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.github.panarik.qa_trainer.databinding.FragmentTheoryBinding

class TheoryFragment : Fragment() {

    private var binding: FragmentTheoryBinding? = null
    private val model by lazy { ViewModelProvider(this)[TheoryViewModel::class.java] }

    override fun onCreateView(inf: LayoutInflater, cont: ViewGroup?, state: Bundle?): View {
        binding = FragmentTheoryBinding.inflate(inf, cont, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.model.init(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}