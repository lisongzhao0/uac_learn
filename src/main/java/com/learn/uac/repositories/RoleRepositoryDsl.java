package com.learn.uac.repositories;

import com.learn.uac.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface RoleRepositoryDsl extends JpaRepository<Role, String>, QuerydslPredicateExecutor<Role> {
}
