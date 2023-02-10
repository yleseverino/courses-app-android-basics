package com.example.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val nameId : Int,
    val NumberViews : Int,
    @DrawableRes val imageId : Int
)
