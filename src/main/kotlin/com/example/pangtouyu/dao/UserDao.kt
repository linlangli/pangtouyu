package com.example.pangtouyu.dao

import com.example.pangtouyu.modal.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserDao : CrudRepository<User, Long>{
    fun findUserByUserIdAndPassword(userId : String, password : String) :User
}