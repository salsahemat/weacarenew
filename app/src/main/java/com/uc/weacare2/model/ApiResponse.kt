package com.uc.weacare2.model
data class ApiResponse <T> (
    val success: Boolean,
    val message: String,
    val data: T
    )