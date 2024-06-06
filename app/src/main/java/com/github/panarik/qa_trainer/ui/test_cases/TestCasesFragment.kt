package com.github.panarik.qa_trainer.ui.test_cases

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.github.panarik.qa_trainer.databinding.FragmentTestCasesBinding

class TestCasesFragment : Fragment() {

    private var binding: FragmentTestCasesBinding? = null
    private val model by lazy { ViewModelProvider(this)[TestCasesViewModel::class.java] }

    override fun onCreateView(inf: LayoutInflater, con: ViewGroup?, state: Bundle?): View {
        binding = FragmentTestCasesBinding.inflate(inf, con, false)
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