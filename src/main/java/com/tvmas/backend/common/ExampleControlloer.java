package com.tvmas.backend.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tvmas.backend.common.domain.Example;
import com.tvmas.backend.common.service.ExampleService;

@Controller
@RequestMapping("/api")
public class ExampleControlloer {

	@Autowired
	private ExampleService exampleService;
    @RequestMapping("/a")
    public String home() {
    	System.out.println("======= calling home page");
        return "index";
    }
    
    @RequestMapping("/test")
    String test1() {
        return "for testing url /test";
    }
    @RequestMapping("/createexample")
    String createExample(){
    	System.out.println("====== create new example");
    	Example example = new Example();
    	example.setId(1);
    	example.setName("luan test");
    	exampleService.create(example);
    	return "call creating example method";
    }

}