package com.example.cyberdump.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DumpyController {

    //@Value("${secretparam}")
    //private String secretparam;

    //private final UserInfoRepository userInfoRepository;

//    //public AuthController(UserInfoRepository userInfoRepository) {
//        this.userInfoRepository = userInfoRepository;
//    }

    @GetMapping("/greet")
    public String greetUser(){
        return "Hello User";
    }


}
