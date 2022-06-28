package com.example.eurekaseoin.adapter.out.persistence.member

import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<MemberJpaEntity, Long> {
    fun getByEmailExists(email: String): Boolean
}
