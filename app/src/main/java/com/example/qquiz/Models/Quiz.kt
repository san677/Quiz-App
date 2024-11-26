package com.example.qquiz.Models

 data class Quiz (

     var id:String="",
     var  title:String="",
     var question:MutableMap<String,Questions> = mutableMapOf()


 )