package com.deepexi.a.domain.vo;

import java.io.Serializable;

/**
 * @author zhougl
 * 2019/3/12
 **/
public class ComponentVo implements Serializable {

    private static final long serialVersionUID = -5649357938516000430L;

    private String moduleName;
    private String moduleType;
    private String moduleVersion;
    private String moduleStatus;

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public String getModuleVersion() {
        return moduleVersion;
    }

    public void setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
    }

    public String getModuleStatus() {
        return moduleStatus;
    }

    public void setModuleStatus(String moduleStatus) {
        this.moduleStatus = moduleStatus;
    }
}
