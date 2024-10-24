package com.parttime.part_time_jobs.exception

import org.springframework.http.HttpStatus

abstract class BaseException(
    val httpStatus: HttpStatus,
    val apiError: ApiError
) : RuntimeException(apiError.description)