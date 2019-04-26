package com.deepexi.a.domain.enums;

import java.util.Objects;

/**
 * @author zhougl
 * 2019/3/12
 **/
public enum ModuleStatusEnum {

    BASIC(1,"基础设施"),
    MIDDLE(2,"业务中台");
    private Integer code;
    private String name;

    ModuleStatusEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static String getName(Integer code){
        for (ModuleStatusEnum payType : ModuleStatusEnum.values()) {
            if(Objects.equals(payType.getCode(), code)){
                return payType.getName();
            }
        }
        return "";
    }
}
