package com.deepexi.a.domain.eo;

import java.io.Serializable;

/**
 * @author zhougl
 * 2019/3/12
 **/
public class Component implements Serializable {
    private static final long serialVersionUID = 2947827804201972621L;
    private Integer id;
    private String moduleName;
    private Integer moduleType;
    private String moduleVersion;
    private Integer moduleStatus;

    public Component() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public String getModuleVersion() {
        return moduleVersion;
    }

    public void setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
    }

    public Integer getModuleStatus() {
        return moduleStatus;
    }

    public void setModuleStatus(Integer moduleStatus) {
        this.moduleStatus = moduleStatus;
    }
}
