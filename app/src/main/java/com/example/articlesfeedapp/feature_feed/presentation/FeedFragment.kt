package com.example.articlesfeedapp.feature_feed.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.articlesfeedapp.R
import com.example.articlesfeedapp.common.MockData
import com.example.articlesfeedapp.databinding.FragmentFeedBinding
import com.example.articlesfeedapp.feature_feed.domain.model.Feed
import com.example.articlesfeedapp.feature_feed.domain.model.FeedCategory
import com.example.articlesfeedapp.feature_feed.presentation.adapter.FeedAdapter
import com.example.articlesfeedapp.feature_feed.presentation.adapter.FeedCategoryAdapter
import timber.log.Timber

class FeedFragment : Fragment() {

    private var _binding: FragmentFeedBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFeedBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initFeedAdapter(MockData.getMockFeeds())

        initFeedCategoryAdapter(MockData.getMockFeedCategories())
    }

    private fun initFeedCategoryAdapter(feedCategories: List<FeedCategory>) {
        val feedCategory = FeedCategoryAdapter(feedCategories) { feedCategory, position ->
            Timber.d("OnClickFeedCategory")
        }

        binding.rvCategory.adapter = feedCategory
    }

    private fun initFeedAdapter(feeds: List<Feed>) {
        val feedAdapter = FeedAdapter(feeds) { feed, position ->
            Timber.d("OnClickFeed")
        }

        binding.rvFeed.adapter = feedAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}