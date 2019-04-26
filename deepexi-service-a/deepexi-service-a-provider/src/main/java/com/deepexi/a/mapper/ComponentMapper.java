package com.deepexi.a.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.a.domain.eo.Component;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author zhougl
 * 2019/3/12
 **/
public interface ComponentMapper /*extends BaseMapper<Component>*/ {
    List<Component> selectPageVo(@Param("moduleName") String moduleName,
                                 @Param("moduleType") String moduleType,
                                 @Param("moduleStatus") String moduleStatus);

    Component getComponentById(Integer id);
    Integer insert(Component component);
    Integer deleteBatchIds(Map<String,Object> params);
    Integer updateById(Component component);
}
