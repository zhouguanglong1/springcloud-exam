package com.deepexi.a.controller;

import com.deepexi.a.domain.eo.Component;
import com.deepexi.a.service.ComponentService;
import com.deepexi.util.config.Payload;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhougl
 * 2019/3/12
 **/
@Api(value = "productcontroller",description = "商品管理")
@RestController
@RequestMapping("/api/v1/components")
public class ComponentController {

    @Autowired
    private ComponentService componentService;

    @ApiOperation(value ="查询所有组件",notes ="查询所有组件，支持条件筛选",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "第几页",required = false,dataType = "Integer"),
            @ApiImplicitParam(name = "size",value = "每页查询数",required = false,dataType = "Integer"),
            @ApiImplicitParam(name = "moduleName",value = "组件名称",required = false,dataType = "Integer"),
            @ApiImplicitParam(name = "moduleType",value = "分类",required = false,dataType = "Integer"),
            @ApiImplicitParam(name = "moduleStatus",value = "状态",required = false,dataType = "Integer")
    })
    @GetMapping
    public Payload getProductList(@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
                                  @RequestParam(name = "size", required = false, defaultValue = "10") Integer size,
                                  @RequestParam(name = "moduleName", required = false, defaultValue = "") String moduleName,
                                  @RequestParam(name = "moduleType", required = false, defaultValue = "") String moduleType,
                                  @RequestParam(name = "moduleStatus", required = false, defaultValue = "") String moduleStatus) {
        return new Payload(componentService.getComponentList(page, size, moduleName,moduleType,moduleStatus));
    }

    @GetMapping("/{id:[a-zA-Z0-9]+}")
    public Payload getProductById(@PathVariable("id") Integer id) {
        return new Payload(componentService.getComponentById(id));
    }

    @PostMapping
    public Payload createProduct(@RequestBody Component component) {
        return new Payload(componentService.createComponent(component));
    }

    @PutMapping("/{id:[a-zA-Z0-9]+}")
    public Payload updateProductById(@PathVariable("id") Integer id, @RequestBody Component component) {
        component.setId(id);
        return new Payload(componentService.updateComponent(component));
    }

    @DeleteMapping("/{id}")
    public Payload deleteProductById(@PathVariable("id") Integer[] id) {
        return new Payload(componentService.deleteComponentById(id));
    }
}
