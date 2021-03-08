package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        (activity as MainActivity).supportActionBar?.title = resources.getString(R.string.android_trivia)
        val binding: FragmentTitleBinding =
                DataBindingUtil.inflate(inflater,
                        R.layout.fragment_title,
                        container,
                        false)
        binding.playButton.setOnClickListener { view ->
            view.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToGameFragment())
        }
        return binding.root
    }
}