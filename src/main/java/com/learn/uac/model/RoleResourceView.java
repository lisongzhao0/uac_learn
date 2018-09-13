package com.learn.uac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 角色资源关系数据库视图
 */
@Entity
@Table(name = "view_uac_role_resource")
public class RoleResourceView {

    @Id
    @Column(name = "role_name", nullable = false, length = 100, unique = true)
    private String roleName;

    @Column(name = "role_enabled", nullable = false)
    private boolean roleEnabled;

    @Column(name = "role_remarks")
    private String roleRemarks;

    @Column(name = "resource_name")
    private String resourceName;

    @Column(name = "resource_enabled", nullable = false)
    private boolean resourceEnabled;

    @Column(name = "resource_remarks")
    private String resourceRemarks;

    @Column(name = "resource", nullable = false, length = 100)
    private String resource;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "desc", nullable = false)
    private String description;

    @Column(name = "sort_idx", nullable = false)
    private int sortIdx;

    //======================================
    //          getter/setter
    //======================================


}
