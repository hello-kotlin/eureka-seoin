package com.example.eurekaseoin.application.port.service

import com.example.eurekaseoin.adapter.exception.ApiCode
import com.example.eurekaseoin.adapter.exception.CustomException
import com.example.eurekaseoin.adapter.`in`.web.dto.CreateMemberDto
import com.example.eurekaseoin.application.port.`in`.MemberUseCase
import com.example.eurekaseoin.application.port.out.persistence.MemberPort
import com.example.eurekaseoin.common.UseCase
import com.example.eurekaseoin.domain.Member
import org.springframework.security.crypto.password.PasswordEncoder

@UseCase
class MemberService(
    private val memberPort: MemberPort,
    private val passwordEncoder: PasswordEncoder
) : MemberUseCase {

    override fun create(createMemberDto: CreateMemberDto): Member {
        if (validateEmailExists(createMemberDto.email)) throw CustomException(ApiCode.ALREADY_EXISTS_EMAIL)

        return@create memberPort.save(
            Member(
                name = createMemberDto.name,
                email = createMemberDto.email,
                password = passwordEncoder.encode(createMemberDto.password)
            )
        )
    }

    override fun validateEmailExists(email: String) = memberPort.getByEmailExists(email)
}
