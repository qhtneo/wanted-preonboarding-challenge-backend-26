package com.wanted.marketapi.service;

import com.wanted.marketapi.domain.Member;
import com.wanted.marketapi.entity.MemberEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-28T22:36:10+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member toDomain(MemberEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Member.MemberBuilder member = Member.builder();

        member.id( entity.getId() );
        member.username( entity.getUsername() );
        member.password( entity.getPassword() );

        return member.build();
    }

    @Override
    public MemberEntity toEntity(Member member) {
        if ( member == null ) {
            return null;
        }

        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setId( member.getId() );
        memberEntity.setUsername( member.getUsername() );
        memberEntity.setPassword( member.getPassword() );

        return memberEntity;
    }
}
