package com.wanted.marketapi.member.service;

import com.wanted.marketapi.member.domain.Member;
import com.wanted.marketapi.member.entity.MemberEntity;
import com.wanted.marketapi.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final MemberMapper mapper;

    public List<Member> getAllMembers() {
        return memberRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    public Member getMemberById(UUID id) {
        return memberRepository.findById(id)
                .map(mapper::toDomain)
                .orElse(null);
    }

    // TODO DTO 만들어서 리턴
    public Member addMember(Member member) {
        MemberEntity memberEntity = mapper.toEntity(member);
        memberRepository.save(memberEntity);

        return member;
    }
}
