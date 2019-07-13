package com.team3.deviceMgmt.DeviceService;

import com.team3.deviceMgmt.models.User;

import java.util.List;

/**
 * Created by admin on 7/13/2019.
 */
public interface UserService {

    public List<User> retrieveUsers();

    public User getUser(Long userId);

    public String saveUser(User user);

    public void deleteUser(Long userId);

    public void updateUser(User user);

    public User getUsersByUserId(Long userId);
}
