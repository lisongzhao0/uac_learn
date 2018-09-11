package com.learn.uac.repositories;

import com.learn.uac.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface MemberRepositoryDsl extends JpaRepository<Member, String>, QuerydslPredicateExecutor<Member> {
}
