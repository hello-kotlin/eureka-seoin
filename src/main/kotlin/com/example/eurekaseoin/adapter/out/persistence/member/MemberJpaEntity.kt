package com.example.eurekaseoin.adapter.out.persistence.member

import com.example.eurekaseoin.adapter.out.persistence.BaseEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "member")
class MemberJpaEntity(
    val name: String,
    val email: String,
    val password: String,
) : BaseEntity()
