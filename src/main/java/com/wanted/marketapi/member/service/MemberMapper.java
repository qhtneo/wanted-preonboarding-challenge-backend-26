package com.wanted.marketapi.member.service;

import com.wanted.marketapi.member.domain.Member;
import com.wanted.marketapi.member.entity.MemberEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member toDomain(MemberEntity entity);
    MemberEntity toEntity(Member member);
}
