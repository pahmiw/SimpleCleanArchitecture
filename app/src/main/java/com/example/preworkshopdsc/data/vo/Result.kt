package com.example.preworkshopdsc.data.vo

sealed class Result<out T> {
    object Loading : Result<Nothing>()
    object Empty : Result<Nothing>()
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val cause: HttpResult = HttpResult.NOT_DEFINED, val code: Int? = null, val errorMessage: String? = null) : Result<Nothing>()
}
