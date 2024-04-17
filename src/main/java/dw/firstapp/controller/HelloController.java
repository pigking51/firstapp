package dw.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/sayHello")
    public String hello(){
        return "Hello world!";
    }
}
