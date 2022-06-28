package com.example.eurekaseoin.adapter.`in`.web.dto

import org.jetbrains.annotations.NotNull
import javax.validation.constraints.Email

data class CreateMemberDto(
    @field:NotNull
    val name: String,
    @field:NotNull
    val password: String,
    @field:Email
    val email: String
)
