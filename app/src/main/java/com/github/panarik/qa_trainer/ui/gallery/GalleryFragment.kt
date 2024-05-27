package com.github.panarik.qa_trainer.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.github.panarik.qa_trainer.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var binding: FragmentGalleryBinding? = null
    private val model by lazy { ViewModelProvider(this)[GalleryViewModel::class.java] }

    override fun onCreateView(inf: LayoutInflater, cont: ViewGroup?, state: Bundle?): View {
        binding = FragmentGalleryBinding.inflate(inf, cont, false)
        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}