package com.parttime.part_time_jobs.exception

import org.springframework.http.HttpStatus

class BaseResponseNotFoundException(errorCode: String, description: String) : BaseException(
    HttpStatus.FOUND,
    ApiError(
        errorCode = errorCode,
        description = description,
    )
) {
}