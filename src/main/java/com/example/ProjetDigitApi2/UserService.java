package com.example.ProjetDigitApi2;

import java.util.List;
import java.util.UUID;

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
    public User getUser(UUID id) {
        return userRepository.getUser(id);
    }

    @Override
    public void addUser(User user) {
        user.setId(UUID.randomUUID());
        userRepository.addUser(user);
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteUser(id);
    }

}
