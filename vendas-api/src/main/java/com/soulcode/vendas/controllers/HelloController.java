package com.soulcode.vendas.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    //@ResponseBody
    public String hello(){
        return "Hello World";
    }
}
