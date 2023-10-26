package com.example.ProjetDigitApi2;


public class User {
    private String username;
    private Long id;

    public User(Long id, String username) {
    	this.id = id;
        this.username = username;
    }
    public Long getId() {
        return id;
    }
    public String getUsername() {
    	return username;
    }
}