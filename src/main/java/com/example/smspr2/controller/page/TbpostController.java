package com.example.smspr2.controller.page;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class TbpostController {
    @GetMapping("/{page}")
    public String page(@PathVariable String page) {
        return "tbpost/" + page;
    }

    @GetMapping("/{page}/{id}")
    public String page(@PathVariable String page, @PathVariable String id) {
        return "tbpost/" + page;
    }
}
