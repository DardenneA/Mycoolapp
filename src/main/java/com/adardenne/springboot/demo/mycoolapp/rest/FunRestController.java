package com.adardenne.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that return "HelloWorld

    @GetMapping("/")
    public String sayHello(){
        return "Hello World !";
    }

    @GetMapping("/hello")
    public String sayHelloToSomeone(@RequestParam(value="name", defaultValue = "World") String name){
        return String.format("Hello %s!",name);
    }

    @GetMapping("/helloInfo")
    public String sayHelloToSomeone(@RequestParam(value="name", defaultValue = "World") String name, @RequestParam(value="info", defaultValue = "What a beautiful day")String info){
        return String.format("Hello %s! %s",name,info);
    }
}
