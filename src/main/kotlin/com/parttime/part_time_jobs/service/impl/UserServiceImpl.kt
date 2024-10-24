package com.parttime.part_time_jobs.service.impl

import com.parttime.part_time_jobs.dto.UserDto
import com.parttime.part_time_jobs.entity.UserEntity
import com.parttime.part_time_jobs.exception.BaseResponseNotFoundException
import com.parttime.part_time_jobs.repository.UserRepository
import com.parttime.part_time_jobs.response.BaseResponse
import com.parttime.part_time_jobs.service.UserService
import com.parttime.part_time_jobs.utils.Constants
import org.springframework.data.domain.PageRequest
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    val userRepository: UserRepository,
) : UserService {
    override fun createUser(userDto: UserDto): BaseResponse<Int> {
        val user = userRepository.findByLoginContainsOrEmailContains(login = userDto.login, email = userDto.email)
        if (user.isEmpty()) {
            return BaseResponse(
                success = true,
                error = null,
                data = userRepository.save(userDto.toEntity()).id,
                message = Constants.User.USER_CREATED_SUCCESSFULLY
            )
        }
        return BaseResponse(
            success = false,
            error = "405",
            data = null,
            message = Constants.User.USER_ALREADY_EXISTS
        )
    }

    override fun getUserAll(pageIndex: Int): BaseResponse<List<UserDto>> {
        return BaseResponse(
            success = true,
            Constants.User.GET_ALL_USERS,
            error = null,
            data = userRepository.findByOrderByFirstname(PageRequest.of(pageIndex, 2)).map { it.toDto() })
    }


    override fun deleteUser(userId: Int) {
        val user = userRepository.findByIdOrNull(userId) ?: throw BaseResponseNotFoundException(
            errorCode = Constants.User.USER_NOT_FOUND,
            description = Constants.User.USER_NOT_FOUND_WITH_ID,
        )
        userRepository.deleteById(user.id)
    }

    private fun UserEntity.toDto(): UserDto {
        return UserDto(
            id = this.id,
            email = this.email,
            firstname = this.firstname,
            lastname = this.lastname,
            login = this.login,
            password = this.password,
            role = this.role,
        )
    }

    private fun UserDto.toEntity(): UserEntity {
        return UserEntity(
            id = 0,
            email = this.email,
            firstname = this.firstname,
            lastname = this.lastname,
            login = this.login,
            password = this.password,
            role = this.role,
        )
    }
}