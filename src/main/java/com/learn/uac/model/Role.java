package com.learn.uac.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "uac_role")
public class Role implements Serializable {

    @Id
    @Column(name = "role_id", nullable = false, unique = true)
    private String roleId;

    @Column(name = "role_name", nullable = false, length = 20)
    private String roleName;

    @Column(name = "status", nullable = false)
    private int status;

    @Column(name = "remarks")
    private String remarks;

    //======================================
    //          getter/setter
    //======================================

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
