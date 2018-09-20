package com.quintype.news.model

import com.google.gson.annotations.SerializedName


class TopStories {

    @SerializedName("name")
    private var name: String? = null

    @SerializedName("summary")
    private var summary: String? = null

    @SerializedName("items")
    private var items: List<ItemsData>? = null


    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getSummary(): String? {
        return summary
    }

    fun setSummary(summary: String) {
        this.summary = summary
    }

    fun getItems(): List<ItemsData>? {
        return items
    }

    fun setItems(items: List<ItemsData>) {
        this.items = items
    }
}