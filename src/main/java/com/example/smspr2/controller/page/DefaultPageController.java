package com.example.smspr2.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
@Controller
public class DefaultPageController {


    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/agree")
    public String agree() {
        return "agree";
    }
}
