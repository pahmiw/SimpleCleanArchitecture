package com.example.preworkshopdsc.util

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions

fun ImageView.loadUrl(url: String) {
    Glide.with(this.context)
        .load(url)
        .thumbnail(0.3f)
        .placeholder(ColorDrawable(Color.LTGRAY))
        .transition(DrawableTransitionOptions.withCrossFade())
        .apply(RequestOptions.fitCenterTransform())
        .into(this)
}