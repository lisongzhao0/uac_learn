package com.learn.uac.services;

import com.learn.uac.model.Resource;
import com.learn.uac.model.Role;

import java.util.Optional;

/**
 * 角色资源接口定义
 */
public interface RoleResourceService {
    //=================================
    // 角色接口
    //=================================
    Optional<Role> getRole(String roleName);
    Optional<Role> getRole(String roleName, boolean enabled);
    Optional<Iterable<Role>> allRole();
    Optional<Iterable<Role>> allRole(boolean enabled);
    Optional<Role> saveRole(Role role);
    Optional<Role> deleteRole(String roleName);
    //=================================
    //  资源接口
    //=================================
    Optional<Iterable<Resource>> getResource(String roleName);
    Optional<Iterable<Resource>> getResource(String roleName, boolean enabled);
    Optional<Iterable<Resource>> allResource();
    Optional<Iterable<Resource>> allResource(boolean enabled);
    Optional<Resource> saveResource(Resource resource);
    Optional<Resource> deleteResource(String resourceName);
    //=================================
    //  角色资源关系接口
    //=================================
    

}
