package com.chiangshin.springcloud.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Hupzon
 */
@FeignClient(name= "demo-server",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @GetMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}