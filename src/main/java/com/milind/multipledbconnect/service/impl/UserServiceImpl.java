package com.milind.multipledbconnect.service.impl;

import com.milind.multipledbconnect.entity.User;
import com.milind.multipledbconnect.repository.UserRepository;
import com.milind.multipledbconnect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public User updateUser(Long id, User user) {
        User currentUser = userRepository.getById(id);
        currentUser.setName(user.getName());
        currentUser.setEmail(user.getEmail());
        return userRepository.save(currentUser);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
