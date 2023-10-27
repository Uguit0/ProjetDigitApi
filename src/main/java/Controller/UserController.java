package Controller;


import java.util.List;
import java.util.UUID;

import Application.UserService;
import Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
    private UserService userService;
	
	
	@GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

	@GetMapping("/{id}")
	public User getUser(@PathVariable UUID id) {
		return userService.getUser(id);
	}

	@PostMapping
	public void addUser(@RequestBody User user) {
	    userService.addUser(user);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable UUID id) {
	    userService.deleteUser(id);
	}

}