package com.parttime.part_time_jobs.response

data class BaseResponse<T>(
    val success: Boolean? = null,
    val message: String?,
    val data: T? = null,
    val error: String?,
)

