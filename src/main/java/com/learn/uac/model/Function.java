package com.learn.uac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;


@Entity
@Table(name = "uac_func")
public class Function implements Serializable {

    @Id
    @Column(name = "func_name", nullable = false, length = 100, unique = true)
    private String funcName;

    @Column(name = "func_title", nullable = false, length = 100)
    private String funcTitle;

    @Column(name = "func_sort", nullable = false)
    private int funcSort;

    @Column(name = "func_type", nullable = false)
    private int funcType;

    @Column(name = "enabled", nullable = false)
    private boolean enabled;

    @Column(name = "remarks")
    private String remarks;

    //======================================
    //          getter/setter
    //======================================

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public String getFuncTitle() {
        return funcTitle;
    }

    public void setFuncTitle(String funcTitle) {
        this.funcTitle = funcTitle;
    }

    public int getFuncSort() {
        return funcSort;
    }

    public void setFuncSort(int funcSort) {
        this.funcSort = funcSort;
    }

    public int getFuncType() {
        return funcType;
    }

    public void setFuncType(int funcType) {
        this.funcType = funcType;
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