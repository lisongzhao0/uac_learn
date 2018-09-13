package com.learn.uac.repositories;

import com.learn.uac.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ResourceRepositoryDsl extends JpaRepository<Resource, String>, QuerydslPredicateExecutor<Resource> {
}
