package com.example.ProjetDigitApi2;

import java.util.List;

public interface IuserRepository {
	
	List<User> getAllUsers();
    User getUser(Long id);
    void addUser(User user);
    void deleteUser(Long id);
//toto
}
