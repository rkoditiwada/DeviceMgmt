package com.team3.deviceMgmt.controller;


import com.team3.deviceMgmt.DeviceService.DeviceService;
import com.team3.deviceMgmt.DeviceService.UserService;
import com.team3.deviceMgmt.models.Device;
import com.team3.deviceMgmt.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value="/getUser/{userId}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long userId)
    {

        return userService.getUsersByUserId(userId);
    }

    @RequestMapping(value="/addUser", method= RequestMethod.POST)
    public String getUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }

    @GetMapping("/api/users")
    public List<User> getUsers() {
        List<User> userList = userService.retrieveUsers();
        return userList;
    }

}

