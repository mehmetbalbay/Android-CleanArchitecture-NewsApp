package com.example.articlesfeedapp.feature_feed.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.articlesfeedapp.databinding.RowNewsCategoryBinding
import com.example.articlesfeedapp.feature_feed.domain.model.FeedCategory

class FeedCategoryAdapter(
    private val feedCategories: List<FeedCategory>,
    private val onClickListeners: (feedCategory: FeedCategory, position: Int) -> Unit
) : RecyclerView.Adapter<FeedCategoryAdapter.NewsCategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsCategoryViewHolder {
        return NewsCategoryViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: NewsCategoryViewHolder, position: Int) {
        val feedCategory = feedCategories[position]
        holder.bind(feedCategory)
    }

    override fun getItemCount(): Int = feedCategories.size

    class NewsCategoryViewHolder(val binding: RowNewsCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(feedCategory: FeedCategory) {
            binding.run {
                ivCategory.setImageResource(feedCategory.image)
            }
        }

        companion object {
            fun from(parent: ViewGroup): NewsCategoryViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = RowNewsCategoryBinding.inflate(layoutInflater, parent, false)

                return NewsCategoryViewHolder(binding)
            }
        }

    }

}
