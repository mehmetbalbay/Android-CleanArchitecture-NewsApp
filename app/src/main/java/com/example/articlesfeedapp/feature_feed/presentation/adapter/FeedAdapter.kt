package com.example.articlesfeedapp.feature_feed.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.articlesfeedapp.databinding.RowNewsBinding
import com.example.articlesfeedapp.feature_feed.domain.model.Feed

class FeedAdapter(
    private val feeds: List<Feed>,
    private val onClickListeners: (feed: Feed, position: Int) -> Unit
) : RecyclerView.Adapter<FeedAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val feed = feeds[position]
        holder.bind(feed)
    }

    override fun getItemCount(): Int = feeds.size

    class NewsViewHolder(val binding: RowNewsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(feed: Feed) {
            binding.run {
                tvTitle.text = feed.title
            }
        }

        companion object {
            fun from (parent: ViewGroup): NewsViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = RowNewsBinding.inflate(layoutInflater, parent, false)

                return NewsViewHolder(binding)
            }
        }

    }

}