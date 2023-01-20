package com.example.catmemepedia.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Cat(
    @StringRes val name: Int,
    @StringRes val description: Int,
    val oneBrainCell: Boolean,
    @DrawableRes val image: Int,
)
