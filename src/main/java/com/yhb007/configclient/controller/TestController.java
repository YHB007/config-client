package com.yhb007.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${mybatis-plus.mapper-locations}")
    private String name;

    public String getName() {
        return "mybatis-plus.mapper-locations: " + name;
    }
}
