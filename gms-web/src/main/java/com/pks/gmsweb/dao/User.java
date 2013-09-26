package com.pks.gmsweb.dao;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = com.pks.gmsweb.domain.User.class)
public interface User {
}
