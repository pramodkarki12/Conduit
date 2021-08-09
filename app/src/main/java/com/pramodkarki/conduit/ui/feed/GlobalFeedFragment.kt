package com.pramodkarki.conduit.ui.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.pramodkarki.conduit.databinding.FragmentFeedBinding


class GlobalFeedFragment: Fragment() {
    private var _binding: FragmentFeedBinding? = null
    private lateinit var _viewModel: FeedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFeedBinding.inflate(inflater, container, false)
        _viewModel = ViewModelProvider(this).get(FeedViewModel::class.java)

        _binding?.fetchFeedBtn?.setOnClickListener {
            _viewModel.fetchGlobalFeed()
        }

        return _binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}