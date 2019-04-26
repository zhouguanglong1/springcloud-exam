package com.deepexi.a.domain.enums;

import java.util.Objects;

/**
 * @author zhougl
 * 2019/3/12
 **/
public enum ModuleTypeEnum {
    UP(1,"上架"),
    DOWN(0,"下架");
    private Integer code;
    private String name;

    ModuleTypeEnum(Integer code, String name) {
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
        for (ModuleTypeEnum payType : ModuleTypeEnum.values()) {
            if(Objects.equals(payType.getCode(), code)){
                return payType.getName();
            }
        }
        return "";
    }
}
