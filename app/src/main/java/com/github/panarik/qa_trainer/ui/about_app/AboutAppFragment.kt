package com.github.panarik.qa_trainer.ui.about_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.github.panarik.qa_trainer.databinding.FragmentAboutAppBinding

class AboutAppFragment : Fragment() {

    private var binding: FragmentAboutAppBinding? = null
    private val model: AboutAppViewModel by lazy { ViewModelProvider(this)[AboutAppViewModel::class.java] }

    override fun onCreateView(infl: LayoutInflater, con: ViewGroup?, state: Bundle?): View {
        binding = FragmentAboutAppBinding.inflate(infl, con, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.init(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}