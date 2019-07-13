package com.team3.deviceMgmt.DeviceService.impl;

import com.team3.deviceMgmt.DeviceService.UserService;
import com.team3.deviceMgmt.models.User;
import com.team3.deviceMgmt.reopository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by admin on 7/13/2019.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> retrieveUsers() {
        List<User> userList = (List<User>) userRepository.findAll();
        return userList;
    }

    public User getUser(Long userId) {
        Optional<User> optEmp = userRepository.findById(userId);
        return optEmp.get();
    }

    public String saveUser(User user){
        userRepository.save(user);
        return user.getUserId().toString();
    }

    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public User getUsersByUserId(Long userId)
    {
        Optional<User> optEmp = userRepository.findById(userId);
        return optEmp.get();
    }


}
