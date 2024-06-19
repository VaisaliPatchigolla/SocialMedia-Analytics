package com.socialMedia.service;

import java.util.List;

import com.socialMedia.entity.User;


public interface UserService {
    User loginUser(String username, String password);
    User getUserById(Long id);
    List<User> getAllUsers();
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
