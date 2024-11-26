package com.example.qquiz.utils

object ColorPicker  {

    val colors= arrayOf("#ff6961",
        "#ffb480",
        "#f8f38d",
        "#42d6a4",
        "#08cad1",
        "#59adf6",
        "#9d94ff",
        "#c780e8",
        "#00FFFF",
        "#00FFFF",
        "#A52A2A")
    var currentColorIndex=0

    fun getColor():String{
        currentColorIndex= (currentColorIndex  + 1)% colors.size

        return   colors[currentColorIndex]
    }
}

