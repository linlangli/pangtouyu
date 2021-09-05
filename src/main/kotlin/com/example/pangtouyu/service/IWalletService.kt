package com.example.pangtouyu.service

import com.example.pangtouyu.common.Response
import com.example.pangtouyu.modal.Consume
import com.example.pangtouyu.modal.User

interface IWalletService {
    fun getConsumeList(userId : String) : MutableList<Consume>
    fun getConsumeList(userId : String, time : String) : MutableList<Consume>
    fun login(userId: String, password : String) : Response<User>
}