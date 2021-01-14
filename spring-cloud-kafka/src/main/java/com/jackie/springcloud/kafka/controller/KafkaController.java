package com.jackie.springcloud.kafka.controller;

import com.jackie.common.annotation.log.DcLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jackie
 * @Date: 2021/1/11 17:40
 * @Version: 1.0.0
 * @function:
 */

@RestController
@RequestMapping("kafka")
public class KafkaController {


    @GetMapping("/hello")
    @DcLog(code=12,value = "这是日志",type = "2dfd")
    public String sayHello(String name){
        return "hello:"+name;
    }



}
