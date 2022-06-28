package com.example.eurekaseoin.adapter.`in`.web

import com.example.eurekaseoin.adapter.`in`.web.MemberController.Companion.MEMBER_API_URI
import com.example.eurekaseoin.adapter.`in`.web.dto.CreateMemberDto
import com.example.eurekaseoin.application.port.`in`.MemberUseCase
import com.example.eurekaseoin.common.WebAdapter
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import javax.validation.Valid

@WebAdapter
@RequestMapping(MEMBER_API_URI)
class MemberController(
    private val memberUseCase: MemberUseCase,
) {

    companion object {
        const val MEMBER_API_URI = "/api/members"
    }

    @PostMapping
    fun create(
        @RequestBody @Valid createMemberDto: CreateMemberDto
    ) = ok(memberUseCase.create(createMemberDto))

    @GetMapping("/duplicated")
    fun validateEmailExists(
        @RequestParam email: String
    ) = ok(memberUseCase.validateEmailExists(email))
}
