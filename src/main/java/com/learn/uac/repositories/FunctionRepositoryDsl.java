package com.learn.uac.repositories;

import com.learn.uac.model.Function;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface FunctionRepositoryDsl extends JpaRepository<Function, String>, QuerydslPredicateExecutor<Function> {
}
