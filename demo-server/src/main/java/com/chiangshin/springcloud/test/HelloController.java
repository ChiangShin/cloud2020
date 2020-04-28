package com.chiangshin.springcloud.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${msg.info}")
    private String msg;

    @RequestMapping("/hello")
    public String index(@RequestParam(required = false) String name) {
        return "hello "+name+"，this is first messge";
    }

    @RequestMapping("/getMsg")
    public String getMsg(){
        return "msg value:"+this.msg;
    }
}