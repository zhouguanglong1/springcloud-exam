package com.deepexi.a.controller;

import com.deepexi.a.depend.DemoClient;
import com.deepexi.util.config.Payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhougl
 * 2019/3/12
 **/
@RestController
@RequestMapping("/consumer")
public class TestFeignController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DemoClient demolient; // feign让跨服务调用能够看起来像本地调用

    @GetMapping("/testFeign")
    public Payload testFeign(@RequestParam Integer a, @RequestParam Integer b) {
        logger.info("远程调用成功: Hello World!!");
        return new Payload(demolient.add(a, b));
    }
}
