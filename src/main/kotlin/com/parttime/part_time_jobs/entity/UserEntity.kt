package com.parttime.part_time_jobs.entity

import jakarta.persistence.*

@Entity
@Table(name = "userDB")
class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val login: String,
    val password: String,
    val email: String,
    val firstname: String,
    val lastname: String,
    val role: String,
)