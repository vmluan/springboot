package com.tvmas.backend.common;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tvmas.backend.common.domain.Example;
import com.tvmas.backend.common.service.ExampleService;

@Controller
@RequestMapping("/api")
public class ExampleControlloer {

	@Autowired
	@Qualifier("mySQLExampleService")
	private ExampleService exampleService;
    @RequestMapping("/a")
    public String home() {
    	System.out.println("======= calling home page");
        return "index";
    }
    
    @RequestMapping("/getexamples")
    String test1() {
    	List<Example> examples = exampleService.findAll();
    	for(Example example : examples){
    		System.out.println(example.getName());
    	}
        return "for testing url /test";
    }
    @RequestMapping("/createexample")
    String createExample(){
    	System.out.println("====== create new example");
    	Example example = new Example();
    	example.setId(1);
    	example.setName("luan test" + new Date().getTime());
    	exampleService.create(example);
    	return "call creating example method";
    }

}