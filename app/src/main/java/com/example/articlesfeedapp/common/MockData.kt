package com.example.articlesfeedapp.common

import com.example.articlesfeedapp.R
import com.example.articlesfeedapp.feature_feed.domain.model.Feed
import com.example.articlesfeedapp.feature_feed.domain.model.FeedCategory

object MockData {

    fun getMockFeeds(): List<Feed> {
        val feed = Feed("", "")

        return listOf(
            feed.copy(id = "1", title = "10 Figma Best Practices to 10X Your Workflow"),
            feed.copy(id = "2", title = "Apple’s Latest iOS and macOS beta undo some..."),
            feed.copy(id = "3", title = "15 Days of Giveaways of Contest"),
            feed.copy(id = "4", title = "Covid-19 Delta Variant Widens Gulf Between..."),
            feed.copy(id = "5", title = "Covid-19 Delta Variant Widens Gulf Between..."),
            feed.copy(id = "6", title = "Covid-19 Delta Variant Widens Gulf Between..."),
        )
    }

    fun getMockFeedCategories(): List<FeedCategory> {
        val feedCategory = FeedCategory("", 0)

        return listOf(
            feedCategory.copy(id = "1", image = R.drawable.news_ct_1),
            feedCategory.copy(id = "2", image = R.drawable.news_ct_2),
            feedCategory.copy(id = "3", image = R.drawable.news_ct_3),
            feedCategory.copy(id = "4", image = R.drawable.news_ct_4),
            feedCategory.copy(id = "5", image = R.drawable.news_ct_5),
            feedCategory.copy(id = "6", image = R.drawable.news_ct_6),
        )
    }

}