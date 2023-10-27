package com.example.Main.Infrastructure;

import com.example.Main.Domain.User;

import java.util.List;
import java.util.UUID;

public interface IuserRepository {
	
	List<User> getAllUsers();
    User getUser(UUID id);
    void addUser(User user);
    void deleteUser(UUID id);
//toto
}
