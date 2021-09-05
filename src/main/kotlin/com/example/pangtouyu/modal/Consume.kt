package com.example.pangtouyu.modal

import org.jetbrains.annotations.NotNull
import org.springframework.data.util.ProxyUtils
import javax.persistence.*

@Entity
@Table(name = "consume")
data class Consume(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Int = -1,
    @NotNull
    val name : String = "-1",
    val description : String? = null,
    @NotNull
    val price : Int = -1,
    @NotNull
    val time : String = "-1",
    @NotNull
    val userId : String = "-1",
    @NotNull
    val userName : String = "-1"
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || ProxyUtils.getUserClass(this) != ProxyUtils.getUserClass(
                other
            )
        ) return false
        other as Consume

        return id == other.id
    }

    override fun hashCode(): Int = 0

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , name = $name , description = $description , price = $price , time = $time , consumerId = $userId , consumerName = $userName )"
    }
}
