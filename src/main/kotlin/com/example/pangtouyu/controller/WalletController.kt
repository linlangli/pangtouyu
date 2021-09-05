package com.example.pangtouyu.controller

import com.alibaba.fastjson.JSON
import com.example.pangtouyu.service.IWalletService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class WalletController {
    @Autowired
    lateinit var iWalletService : IWalletService

    @PostMapping(value = ["/getConsumes"])
    fun getConsumes(@RequestParam("userId") userId : String) : String {
        println("getConsumes | consumerId: $userId")
        val consumesList = iWalletService.getConsumeList(userId)
        val response = JSON.toJSONString(consumesList)
        println("getConsumes | consumesList: $response")
        return response
    }

    @PostMapping(value = ["/getConsumesByTime"])
    fun getConsumesByTime(
        @RequestParam("userId") userId : String,
        @RequestParam("time") time : String) : String {
        val consumesList = iWalletService.getConsumeList(userId, time)
        val response = JSON.toJSONString(consumesList)
        println("getConsumesByTime | consumesList: $response")
        return response
    }

    @PostMapping(value = ["/login"])
    fun login(@RequestParam("userId") userId : String, @RequestParam("password") password : String) : String {
        println("getConsumes | consumerId: $userId | password: $password")
        val consumesList = iWalletService.getConsumeList(userId)
        val response = JSON.toJSONString(consumesList)
        println("getConsumes | consumesList: $response")
        return response
    }
}