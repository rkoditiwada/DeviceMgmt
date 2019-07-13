package com.team3.deviceMgmt.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value="/getUser/{userId}", method=RequestMethod.GET)
    public String getUser()
    {
        return "Hello Get Method getUser";
    }

}

