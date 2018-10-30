package com.xue.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String  index(){
        return "index";
    }
    @RequestMapping("/hello")
    public String  hello(){
        return "hello";
    }
}
