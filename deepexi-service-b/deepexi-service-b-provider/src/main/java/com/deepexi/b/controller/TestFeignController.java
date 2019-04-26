package com.deepexi.b.controller;

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
@RequestMapping("/provider")
public class TestFeignController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/add")
    public Payload testFeign(@RequestParam Integer a, @RequestParam Integer b) {
        logger.info("远程调用成功: Hello World!!");
        return new Payload("a+b="+(a+b),"200","ok,I am from provider b");
    }
}
