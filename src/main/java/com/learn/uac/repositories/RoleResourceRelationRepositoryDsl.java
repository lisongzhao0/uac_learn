package com.learn.uac.repositories;

import com.learn.uac.model.RoleResourceRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface RoleResourceRelationRepositoryDsl extends JpaRepository<RoleResourceRelation, String>, QuerydslPredicateExecutor<RoleResourceRelation> {
}
