package com.team3.deviceMgmt.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {

    @RequestMapping(value="/getDevice/{userId}", method= RequestMethod.GET)
    public String getDevice()
    {
        return "Hello Get Method in getDevice";
    }

}
