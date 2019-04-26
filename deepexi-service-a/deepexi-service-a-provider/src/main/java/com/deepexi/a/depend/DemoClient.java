package com.deepexi.a.depend;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by donh on 2018/11/5.
 */
@FeignClient("DEEPEXI-SERVICE-B-PROVIDER")
public interface DemoClient {

    @RequestMapping(method = RequestMethod.GET, value = "/deepexi-service-b/provider/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}