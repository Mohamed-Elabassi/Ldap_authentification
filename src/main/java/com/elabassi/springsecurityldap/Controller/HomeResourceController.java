package com.elabassi.springsecurityldap.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResourceController {

    @GetMapping("/home")
    public String getHome(){
        System.out.println("here");
        return "Home page";
    }
}
