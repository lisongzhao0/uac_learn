package com.learn.uac.model;

import javax.persistence.*;

@Entity
@Table(name = "uac_role_func")
public class RoleFunctionRelation {

    @ManyToOne
    @JoinColumn(name = "role_name")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "func_name")
    private Function func;

    @Column(name = "module", length = 100)
    private String module;

    //======================================
    //          getter/setter
    //======================================


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Function getFunc() {
        return func;
    }

    public void setFunc(Function func) {
        this.func = func;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
