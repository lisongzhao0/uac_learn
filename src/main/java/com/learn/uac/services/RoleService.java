package com.learn.uac.services;

import com.learn.uac.model.Role;

import java.util.Optional;

public interface RoleService {
    Optional<Member> getRole(long roleId);
}
