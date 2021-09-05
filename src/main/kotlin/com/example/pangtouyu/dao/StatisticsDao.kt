package com.example.pangtouyu.dao

import com.example.pangtouyu.modal.Consume
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import javax.persistence.Id

@Repository
interface StatisticsDao : CrudRepository<Consume, Long> {
    fun findConsumesByUserId(userId: String) : MutableList<Consume>
    fun findConsumesByUserIdAndTime(userId : String, time : String) : MutableList<Consume>
}