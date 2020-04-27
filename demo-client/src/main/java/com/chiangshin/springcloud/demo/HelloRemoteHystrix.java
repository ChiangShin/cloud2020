package com.chiangshin.springcloud.demo;

import org.springframework.stereotype.Component;

/**
 * @Author jx
 * @Date 2020/4/27 10:29
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    public String hello(String name) {
        return "call hello error";
    }
}
