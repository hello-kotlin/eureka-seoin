package com.example.eurekaseoin.application.port.out.persistence

import com.example.eurekaseoin.domain.Member

interface MemberPort {
    fun save(member: Member): Member
    fun getByEmailExists(email: String): Boolean
}
