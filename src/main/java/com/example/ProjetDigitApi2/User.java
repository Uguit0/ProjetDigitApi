package com.example.ProjetDigitApi2;


import java.util.UUID;

public class User {
    private String username;
    private UUID id;

    public User(UUID id, String username) {
    	this.id = id;
        this.username = username;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id){
         this.id = id;

    }
    public String getUsername() {
    	return username;
    }
}