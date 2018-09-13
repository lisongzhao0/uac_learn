package com.learn.uac.repositories;

import com.learn.uac.model.RoleResourceView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface RoleResourceViewRepositoryDsl extends JpaRepository<RoleResourceView, String>, QuerydslPredicateExecutor<RoleResourceView> {
}
