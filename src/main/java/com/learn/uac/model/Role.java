package com.learn.uac.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 角色数据库模型
 */
@Entity
@Table(name = "uac_role")
public class Role implements Serializable {

    @Id
    @Column(name = "role_name", nullable = false, length = 100, unique = true)
    private String roleName;

    @Column(name = "enabled", nullable = false)
    private boolean enabled;

    @Column(name = "remarks")
    private String remarks;

    //======================================
    //          getter/setter
    //======================================

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
