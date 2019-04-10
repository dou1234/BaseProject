package com.dou.base.controller.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value="/demo", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoController {

	@RequestMapping("/hello")
    public String hello(){
        return "Greetings from Spring Boot!";
    }
}
