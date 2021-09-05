package com.example.pangtouyu.modal

import org.hibernate.Hibernate
import org.jetbrains.annotations.NotNull
import javax.persistence.*

@Entity
@Table(name = "user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Int = -1,
    @NotNull
    val userId : String = "-1",
    @NotNull
    val userName : String = "-1",
    @NotNull
    val password : String = "-1",
    val age : Int? = null,
    @NotNull
    val income : Int = -1,
    @NotNull
    val expenses : Int = -1,
    @NotNull
    val balance : Int = -1,
    val description : String? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as User

        return id == other.id
    }

    override fun hashCode(): Int = 0

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , name = $userName , age = $age , income = $income , expenses = $expenses , balance = $balance , description = $description )"
    }
}