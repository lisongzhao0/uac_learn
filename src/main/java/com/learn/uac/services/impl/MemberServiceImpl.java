package com.learn.uac.services.impl;

import com.learn.uac.model.dsl.QMember;
import com.learn.uac.repositories.MemberRepositoryDsl;
import com.learn.uac.services.MemberService;
import com.learn.uac.model.Member;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Service("MemberServiceImpl")
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepositoryDsl repositoryDsl;

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    private JPAQueryFactory queryFactory;

    @PostConstruct
    public void init() {
        queryFactory = new JPAQueryFactory(entityManager);
    }

    @Override
    public Optional<Member> getMember(String account) {
        QMember qmember = QMember.member;
        Predicate predicate = qmember.account.eq(account);
        return repositoryDsl.findOne(predicate);
    }
}
