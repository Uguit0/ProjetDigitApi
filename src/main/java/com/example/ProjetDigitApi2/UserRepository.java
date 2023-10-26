package com.example.ProjetDigitApi2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IuserRepository {

    private List<User> users = new ArrayList<>();
    
    public UserRepository() {
    	users.add(new User(1L, "Ugo Da Silva"));
        users.add(new User(2L, "Leo Bernard"));
    }
    
    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUser(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
   

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void deleteUser(Long id) {
    	for (int i = 0; i < users.size(); i++) {
    	    if (users.get(i).getId().equals(id)) {
    	        users.remove(i);
    	        break; 
    	    }
    	}

    }

}
