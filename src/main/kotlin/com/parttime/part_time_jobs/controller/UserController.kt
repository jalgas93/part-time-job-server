package com.parttime.part_time_jobs.controller

import com.parttime.part_time_jobs.dto.UserDto
import com.parttime.part_time_jobs.response.BaseResponse
import com.parttime.part_time_jobs.service.UserService
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.DeleteMapping

@RestController
@RequestMapping("/api/user")
class UserController(
    private val userService: UserService
) {
    @GetMapping("/hello")
    fun hello(): String = "Hello World"

    @GetMapping("/getAll")
    fun getAll(@RequestParam("page") pageIndex: Int): BaseResponse<List<UserDto>> = userService.getUserAll(pageIndex)

    @PostMapping("/createUser")
    fun create(@RequestBody user: UserDto):BaseResponse<Int> = userService.createUser(user)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int) {
        userService.deleteUser(id)
    }
}