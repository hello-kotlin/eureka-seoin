package com.example.eurekaseoin.application.port.`in`

import com.example.eurekaseoin.adapter.`in`.web.dto.CreateMemberDto
import com.example.eurekaseoin.domain.Member

interface MemberUseCase {
    fun create(createMemberDto: CreateMemberDto): Member
    fun validateEmailExists(email: String): Boolean
}
