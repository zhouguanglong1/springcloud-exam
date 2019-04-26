package com.deepexi.a.service;

import com.deepexi.a.domain.eo.Component;
import com.deepexi.a.domain.eo.Product;
import com.deepexi.util.pageHelper.PageBean;

import java.util.List;

public interface ComponentService {

    PageBean getComponentList(Integer page, Integer size,String moduleName,String moduleType,String moduleStatus);

    Component getComponentById(Integer id);

    Integer createComponent(Component component);

    Integer deleteComponentById(Integer[] id);

    Integer updateComponent(Component component);
}
