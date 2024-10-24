package com.parttime.part_time_jobs.repository

import com.parttime.part_time_jobs.entity.UserEntity
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<UserEntity, Int> {
    fun findByOrderByFirstname(pageable: Pageable): List<UserEntity>
    fun findByLoginContainsOrEmailContains(login:String,email:String): List<UserEntity>
}