package com.example.pangtouyu.common

data class Response<T>(
    val code : Int,
    val message : String,
    val data : T?
)