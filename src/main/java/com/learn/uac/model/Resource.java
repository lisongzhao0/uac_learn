package com.learn.uac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

/**
 * 资源数据库模型
 */
@Entity
@Table(name = "uac_resource")
public class Resource implements Serializable {

    @Id
    @Column(name = "resource_name", nullable = false, length = 100, unique = true)
    private String resourceName;

    @Column(name = "resource", nullable = false, length = 100)
    private String resource;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "desc", nullable = false)
    private String description;

    @Column(name = "sort_idx", nullable = false)
    private int sortIdx;

    @Column(name = "enabled", nullable = false)
    private boolean enabled;

    @Column(name = "remarks")
    private String remarks;

    //======================================
    //          getter/setter
    //======================================


    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSortIdx() {
        return sortIdx;
    }

    public void setSortIdx(int sortIdx) {
        this.sortIdx = sortIdx;
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