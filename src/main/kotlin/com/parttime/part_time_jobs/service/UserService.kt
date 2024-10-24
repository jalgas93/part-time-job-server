package com.parttime.part_time_jobs.service

import com.parttime.part_time_jobs.dto.UserDto
import com.parttime.part_time_jobs.response.BaseResponse

interface UserService {
    fun createUser(userDto: UserDto): BaseResponse<Int>
    fun getUserAll(pageIndex: Int): BaseResponse<List<UserDto>>
    fun deleteUser(userId: Int)
}