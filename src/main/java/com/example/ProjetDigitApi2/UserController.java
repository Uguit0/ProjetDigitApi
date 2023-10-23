package com.example.ProjetDigitApi2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	private List<String> users;

	public UserController() {
		users = new ArrayList<>();
		users.add("Alex");
		users.add("Alice");
		users.add("Yoan");
	}

	@GetMapping
	public List<String> getAllUsers() {
		return users;
	}

	@GetMapping("/{userName}")
	public ResponseEntity<String> getUser(@PathVariable String userName) {
	    for (String user : users) {
	        if (user.equals(userName)) {
	            return ResponseEntity.ok(user);
	        }
	    }
	    return ResponseEntity.notFound().build();
	}

	@PostMapping
	public void addUser(@RequestBody String userName) {
		users.add(userName);
	}

	@DeleteMapping("/{userName}")
	public void deleteUser(@PathVariable String userName) {
		users.remove(userName);
	}

}