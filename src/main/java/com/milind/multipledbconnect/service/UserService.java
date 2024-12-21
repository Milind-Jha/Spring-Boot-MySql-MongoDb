package com.milind.multipledbconnect.service;

import com.milind.multipledbconnect.entity.User;

public interface UserService {

    public User createUser(User user);
    public User getUser(Long id);
    public User updateUser(Long id, User newUserData);
    public void deleteUser(Long id);
}
