package com.quintype.news.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Story {

    @SerializedName("author-name")
    private var authorName: String? = null

    @SerializedName("headline")
    private var headline: String? = null

    @SerializedName("slug")
    private var slug: String? = null

    @SerializedName("summary")
    private var summary: String? = null

    @SerializedName("hero-image")
    private var heroImage: String? = null


    fun getAuthorName(): String? {
        return authorName
    }

    fun setAuthorName(authorName: String) {
        this.authorName = authorName
    }

    fun getHeadline(): String? {
        return headline
    }

    fun setHeadline(headline: String) {
        this.headline = headline
    }

    fun getSlug(): String? {
        return slug
    }

    fun setSlug(slug: String) {
        this.slug = slug
    }

    fun getSummary(): String? {
        return summary
    }

    fun setSummary(summary: String) {
        this.summary = summary
    }

    fun getHeroImage(): String? {
        return heroImage
    }

    fun setHeroImage(heroImage: String) {
        this.heroImage = heroImage
    }
}