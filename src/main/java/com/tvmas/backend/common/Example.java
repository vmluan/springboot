package com.tvmas.backend.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Example {

    @RequestMapping("/a")
    public String home() {
    	System.out.println("======= calling home page");
        return "index";
    }
    
    @RequestMapping("/test")
    String test1() {
        return "for testing url /test";
    }

}