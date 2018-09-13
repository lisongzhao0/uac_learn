package com.learn.uac.model;

import javax.persistence.*;

/**
 * 角色资源关系数据库模型
 */
@Entity
@Table(name = "uac_role_resource")
public class RoleResourceRelation {

    @Id
    @Column(name = "role_name", nullable = false, length = 100)
    private String roleName;

    @Column(name = "resource_name", nullable = false, length = 100)
    private String resourceName;

    //======================================
    //          getter/setter
    //======================================

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
}
