package com.marlonncarvalhosa.testesportheca.utils

sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
)

class Success<T>(data: T) : Resource<T>(data)
class Failed<T> : Resource<T>()
class Loading<T>(data: T? = null) : Resource<T>(data)
