package com.socialMedia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.socialMedia.entity.User;
import com.socialMedia.repository.UserRepository;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
    
    @Override
    public User loginUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public User updateUser(Long id, User user) {
        user.setUserId(id);
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
