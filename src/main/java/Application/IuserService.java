package Application;

import Domain.User;

import java.util.List;
import java.util.UUID;

public interface IuserService {
	
    List<User> getAllUsers();
    User getUser(UUID id);
    void addUser(User user);
    void deleteUser(UUID id);

}
