package com.github.panarik.qa_trainer.ui.main.article

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.github.panarik.qa_trainer.databinding.FragmentArticleBinding

class ArticleFragment : Fragment() {

    private var binding: FragmentArticleBinding? = null
    private val model by lazy { ViewModelProvider(this)[ArticleViewModel::class.java] }

    override fun onCreateView(inf: LayoutInflater, cont: ViewGroup?, state: Bundle?): View {
        binding = FragmentArticleBinding.inflate(inf, cont, false)
        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}