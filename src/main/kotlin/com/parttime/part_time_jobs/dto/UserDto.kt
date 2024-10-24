package com.parttime.part_time_jobs.dto

data class UserDto(
    val id: Int? = null,
    var login: String,
    var password: String,
    var email: String,
    var firstname: String,
    var lastname: String,
    var role: String,
)