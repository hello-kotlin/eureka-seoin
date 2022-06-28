package com.example.eurekaseoin.domain

import com.example.eurekaseoin.common.Domain

@Domain
class Member(
    val name: String,
    val email: String,
    val password: String
)
