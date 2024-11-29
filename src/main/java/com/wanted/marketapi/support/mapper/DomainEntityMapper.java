package com.wanted.marketapi.support.mapper;

public interface DomainEntityMapper<DOMAIN, ENTITY> {
    DOMAIN toDomain(ENTITY entity);
    ENTITY toEntity(DOMAIN domain);
}
