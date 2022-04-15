package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val imageResourceId: Int,
    @DrawableRes val stringResourceId: Int){

}