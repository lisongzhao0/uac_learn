package com.learn.uac.services.impl;

import com.learn.uac.model.Function;
import com.learn.uac.model.dsl.QFunction;
import com.learn.uac.model.dsl.QRole;
import com.learn.uac.model.dsl.QRoleFunctionRelation;
import com.learn.uac.repositories.FunctionRepositoryDsl;
import com.learn.uac.services.FunctionService;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import edu.emory.mathcs.backport.java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import java.util.Optional;

@Service("FunctionServiceImpl")
public class FunctionServiceImpl implements FunctionService {

    @Autowired
    private FunctionRepositoryDsl repositoryDsl;

    @Autowired
    private EntityManager entityManager;

    private JPAQueryFactory queryFactory;

    @PostConstruct
    public void init() {
        queryFactory = new JPAQueryFactory(entityManager);
    }

    @Override
    public Optional<Iterable<Function>> getFunction(String roleName) {
        QFunction qfunc = QFunction.function;
        QRole     qrole = QRole.role;
        QRoleFunctionRelation qrolefunc = QRoleFunctionRelation.roleFunctionRelation;

        JPQLQuery query = queryFactory.select(qfunc)
                .from(qfunc)
                .where(qfunc.funcName.in(
                        JPAExpressions.select(qrolefunc.func.funcName)
                                .from(qrolefunc)
                                .leftJoin(qrole)
                                .on(qrole.roleName.eq(qrolefunc.role.roleName))
                                .where(qrole.roleName.eq(roleName))
                )).orderBy(qfunc.funcSort.asc());
        return Optional.ofNullable(query.fetch());
    }

    @Override
    public Optional<Iterable<Function>> getFunction(String roleName, boolean enabled) {
        QFunction qfunc = QFunction.function;
        QRole     qrole = QRole.role;
        QRoleFunctionRelation qrolefunc = QRoleFunctionRelation.roleFunctionRelation;

        JPQLQuery query = queryFactory.select(qfunc)
                .from(qfunc)
                .where(qfunc.funcName.in(
                        JPAExpressions.select(qrolefunc.func.funcName)
                                .from(qrolefunc)
                                .leftJoin(qrole)
                                .on(qrole.roleName.eq(qrolefunc.role.roleName))
                                .where(qrole.roleName.eq(roleName))
                       ).and(qfunc.enabled.eq(enabled))
                )
                .orderBy(qfunc.funcSort.asc());
        return Optional.ofNullable(query.fetch());
    }

    @Override
    public Optional<Iterable<Function>> allFunction() {
        return Optional.ofNullable(repositoryDsl.findAll(new Sort(Sort.Direction.ASC, "func_name")));
    }

    @Override
    public Optional<Iterable<Function>> allFunction(boolean enabled) {
        QFunction qfunc = QFunction.function;
        Predicate predicate = qfunc.enabled.eq(enabled);
        return Optional.ofNullable(repositoryDsl.findAll(predicate, new Sort(Sort.Direction.ASC, "func_name")));
    }
}
