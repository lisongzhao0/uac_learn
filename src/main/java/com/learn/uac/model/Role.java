package com.learn.uac.model;


import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "uac_role_func", joinColumns = { @JoinColumn(name = "role_name") }, inverseJoinColumns = { @JoinColumn(name = "func_name") })
    @LazyCollection(LazyCollectionOption.EXTRA)
    private Set<Function> functions = new HashSet<>();

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
