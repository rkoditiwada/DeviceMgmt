package com.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/device")
public class DeviceController {

    @RequestMapping(value="/getDevice/{userId}", method= RequestMethod.GET)
    public String getDevice()
    {
        return "Hello Get Method";
    }

}
