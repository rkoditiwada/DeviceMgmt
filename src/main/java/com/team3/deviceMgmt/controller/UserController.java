package com.team3.deviceMgmt.controller;


import com.team3.deviceMgmt.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @RequestMapping(value="/getUser/{userId}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long userId)
    {

        if(userId == 1L) {
            User user = new User();
            user.setRole("GeneralUser");
            user.setUserId(1L);
            user.setUserName("General User");

            return user;
        }

        if(userId == 2L) {
            User user = new User();
            user.setRole("Admin");
            user.setUserId(2L);
            user.setUserName("Admin User");

            return user;
        }

        return new User();
    }

}

