package com.example.eurekaseoin.adapter.exception

enum class ApiCode(
    val code: Int,
    val message: String
) {
    ALREADY_EXISTS_EMAIL(1000, "email already exists")
}
