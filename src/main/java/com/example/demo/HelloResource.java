package com.example.demo;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class HelloResource {
    @RequestMapping({"/"})
    public String halo(){
        return "Em lam xong roi day a. Dang nghien cuu mapping qua trang index ";
    }
}
