package com.example.smspr2.controller;

import com.example.smspr2.service.DefaultService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RequestMapping("/api")
@RestController


public class DefaultRestController {
    private final DefaultService defaultService;

    public DefaultRestController(DefaultService defaultService) {
        this
                .defaultService = defaultService;
    }
    @GetMapping("/create")
        public Map<String, Object> create (@RequestParam Map < String, String > params){
            return defaultService.create(params);
        }


    @GetMapping("/test")
    public String test() {
        return "test";
    }


}
