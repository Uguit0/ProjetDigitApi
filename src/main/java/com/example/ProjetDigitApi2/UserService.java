package com.example.ProjetDigitApi2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IuserService {

    @Autowired
    private IuserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User getUser(Long id) {
        return userRepository.getUser(id);
    }

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }

}
