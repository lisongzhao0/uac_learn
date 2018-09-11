package com.learn.uac.services;

import com.learn.uac.model.Role;

import java.util.Optional;

/**
 * 角色信息接口定义
 */
public interface RoleService {
    Optional<Role> getRole(String roleName);
    Optional<Role> getRole(String roleName, boolean enabled);
    Optional<Iterable<Role>> allRole();
    Optional<Iterable<Role>> allRole(boolean enabled);
}
