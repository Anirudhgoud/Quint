package com.quintype.news.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class ItemsData {

    @SerializedName("id")
    private var id: String? = null

    @SerializedName("type")
    private var type: String? = null

    @SerializedName("name")
    private var name: String? = null

    @SerializedName("url")
    private var url: String? = null

    @SerializedName("slug")
    private var slug: String? = null

    @SerializedName("story")
    private var story: Story? = null


    fun getId(): String? {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

    fun getType(): String? {
        return type
    }

    fun setType(type: String) {
        this.type = type
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getSlug(): String? {
        return slug
    }

    fun setSlug(slug: String) {
        this.slug = slug
    }

    fun getStory(): Story? {
        return story
    }

    fun setStory(story: Story) {
        this.story = story
    }

}