package com.learn.uac.services.impl;

import com.learn.uac.model.Resource;
import com.learn.uac.model.Role;
import com.learn.uac.model.dsl.QRole;
import com.learn.uac.repositories.RoleRepositoryDsl;
import com.learn.uac.services.RoleResourceService;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Service("RoleResourceServiceImpl")
public class RoleResourceServiceImpl implements RoleResourceService {

    @Autowired
    private RoleRepositoryDsl repositoryDsl;

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    private JPAQueryFactory queryFactory;

    @Override
    public Optional<Role> getRole(String roleName) {
        QRole qrole = QRole.role;
        Predicate predicate = qrole.roleName.eq(roleName);
        return repositoryDsl.findOne(predicate);
    }

    @Override
    public Optional<Role> getRole(String roleName, boolean enabled) {
        QRole qrole = QRole.role;
        Predicate predicate = qrole.enabled.eq(enabled)
                         .and(qrole.roleName.eq(roleName));
        return repositoryDsl.findOne(predicate);
    }

    @Override
    public Optional<Iterable<Role>> allRole() {
        return Optional.ofNullable(repositoryDsl.findAll());
    }

    @Override
    public Optional<Iterable<Role>> allRole(boolean enabled) {
        QRole qrole = QRole.role;
        Predicate predicate = qrole.enabled.eq(enabled);
        return Optional.ofNullable(repositoryDsl.findAll(predicate));
    }

    @Override
    public Optional<Role> saveRole(Role role) {
        return Optional.empty();
    }

    @Override
    public Optional<Role> deleteRole(String roleName) {
        return Optional.empty();
    }

    @Override
    public Optional<Iterable<Resource>> getResource(String roleName) {
        return Optional.empty();
    }

    @Override
    public Optional<Iterable<Resource>> getResource(String roleName, boolean enabled) {
        return Optional.empty();
    }

    @Override
    public Optional<Iterable<Resource>> allResource() {
        return Optional.empty();
    }

    @Override
    public Optional<Iterable<Resource>> allResource(boolean enabled) {
        return Optional.empty();
    }

    @Override
    public Optional<Resource> saveResource(Resource resource) {
        return Optional.empty();
    }

    @Override
    public Optional<Resource> deleteResource(String resourceName) {
        return Optional.empty();
    }
}
