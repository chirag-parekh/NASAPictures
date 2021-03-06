package com.cap.nasapictures

sealed class ResponseManager<out T : Any> {
    data class Success<T : Any>(val data: T) : ResponseManager<T>()
    data class Error(val message: String = "") : ResponseManager<Nothing>()
}