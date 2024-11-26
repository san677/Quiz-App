package com.example.qquiz.utils

import com.example.qquiz.R

object IconPicker  {

    val icons= arrayOf(
        R.drawable.ic_im1,
        R.drawable.ic_im2,
        R.drawable.ic_im3,
        R.drawable.ic_im4,
        R.drawable.ic_im5,
        R.drawable.ic_im6,
        R.drawable.ic_im7,
        R.drawable.ic_im8,)

    var currentIcon=0

    fun getIcon(): Int {
        currentIcon= (currentIcon  + 1)% icons.size

        return   icons[currentIcon]
    }
}