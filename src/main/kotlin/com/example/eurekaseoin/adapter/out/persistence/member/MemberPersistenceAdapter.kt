package com.example.eurekaseoin.adapter.out.persistence.member

import com.example.eurekaseoin.application.port.out.persistence.MemberPort
import com.example.eurekaseoin.common.PersistenceAdapter
import com.example.eurekaseoin.domain.Member
import org.modelmapper.ModelMapper

@PersistenceAdapter
class MemberPersistenceAdapter(
    private val memberRepository: MemberRepository,
    private val modelMapper: ModelMapper
) : MemberPort {

    override fun save(member: Member): Member {
        memberRepository.save(modelMapper.map(member, MemberJpaEntity::class.java))
        return@save member
    }

    override fun getByEmailExists(email: String) =
        memberRepository.getByEmailExists(email)
}
