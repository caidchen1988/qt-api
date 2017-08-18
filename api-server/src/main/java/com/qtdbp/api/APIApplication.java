package com.qtdbp.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: caidchen
 * @create: 2017-08-16 14:16
 * To change this template use File | Settings | File Templates.
 */
@RestController
@SpringBootApplication
public class APIApplication {
    public static void main(String[] args) {
        SpringApplication.run(APIApplication.class, args);
    }


    // 根目录映射 Get访问方式 直接返回一个字符串
    @RequestMapping("/")
    Map<String, String> hello() {
        Map<String,String> map=new HashMap<String,String>();
        map.put("content", "hello freewolf~");
        return map;
    }
}
