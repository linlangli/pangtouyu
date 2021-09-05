package com.example.pangtouyu.service.imp

import com.example.pangtouyu.common.Response
import com.example.pangtouyu.dao.StatisticsDao
import com.example.pangtouyu.dao.UserDao
import com.example.pangtouyu.modal.Consume
import com.example.pangtouyu.modal.User
import com.example.pangtouyu.service.IWalletService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class WalletService : IWalletService {
    @Autowired
    lateinit var statisticsDao: StatisticsDao
    @Autowired
    lateinit var userDao: UserDao

    override fun getConsumeList(userId: String): MutableList<Consume> {
        println("getConsumeList | consumerId: $userId")
        return statisticsDao.findConsumesByUserId(userId)
    }
    override fun getConsumeList(userId: String, time: String): MutableList<Consume> {
        return statisticsDao.findConsumesByUserIdAndTime(userId, time)
    }

    override fun login(userId: String, password: String): Response<User> {
        val user = userDao.findUserByUserIdAndPassword(userId, password)
        if (user.id == -1) {
            return Response(-1, "登录数百", null)
        }
        return Response(200, "登录成功", user)
    }
}