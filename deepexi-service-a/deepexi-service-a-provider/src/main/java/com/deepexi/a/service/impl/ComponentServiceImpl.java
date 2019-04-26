package com.deepexi.a.service.impl;

import com.deepexi.a.domain.enums.ModuleStatusEnum;
import com.deepexi.a.domain.enums.ModuleTypeEnum;
import com.deepexi.a.domain.eo.Component;
import com.deepexi.a.domain.vo.ComponentVo;
import com.deepexi.a.mapper.ComponentMapper;
import com.deepexi.a.service.ComponentService;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhougl
 * 2019/3/12
 **/
@Service
public class ComponentServiceImpl implements ComponentService {

    @Autowired
    private ComponentMapper componentMapper;

    @Override
    public PageBean getComponentList(Integer page, Integer size, String moduleName, String moduleType, String moduleStatus) {
        PageHelper.startPage(page, size);
        List<Component> components = componentMapper.selectPageVo(moduleName, moduleType, moduleStatus);
        List<ComponentVo> result = new ArrayList<>(size);
        components.forEach(component -> {
            ComponentVo componentVo = new ComponentVo();
            componentVo.setModuleName(component.getModuleName());
            componentVo.setModuleStatus(ModuleStatusEnum.getName(component.getModuleStatus()));
            componentVo.setModuleType(ModuleTypeEnum.getName(component.getModuleType()));
            componentVo.setModuleVersion(component.getModuleVersion());
            result.add(componentVo);
        });
        // TODO 此处分页换成别的bean的list就失效了，暂时不清楚具体原因
        return new PageBean<>(components);
    }

    @Override
    public Component getComponentById(Integer id) {
        return componentMapper.getComponentById(id);
    }

    @Override
    public Integer createComponent(Component component) {
        return componentMapper.insert(component);
    }

    @Override
    public Integer deleteComponentById(Integer[] ids) {
        Map<String,Object> params = new HashMap<>(1);
        params.put("ids",ids);
        return componentMapper.deleteBatchIds(params);
    }

    @Override
    public Integer updateComponent(Component component) {
        return componentMapper.updateById(component);
    }
}
