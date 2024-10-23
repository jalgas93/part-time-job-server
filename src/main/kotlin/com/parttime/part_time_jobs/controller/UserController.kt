package com.parttime.part_time_jobs.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController {
    @GetMapping("/hello")
    fun hello(): String = "Hello World"
}