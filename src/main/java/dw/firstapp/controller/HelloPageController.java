package dw.firstapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloPageController {
    @GetMapping("/Hello")
    public String hello(){
        return "redirect:/hello.html";
    }
}
