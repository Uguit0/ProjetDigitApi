package Infrastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import Domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IuserRepository {

    private List<User> users = new ArrayList<>();
    
    public UserRepository() {
    	users.add(new User(UUID.randomUUID(), "Ugo Da Silva"));
        users.add(new User(UUID.randomUUID(), "Leo Bernard"));
    }
    
    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUser(UUID id) {
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
    public void deleteUser(UUID id) {
    	for (int i = 0; i < users.size(); i++) {
    	    if (users.get(i).getId().equals(id)) {
    	        users.remove(i);
    	        break; 
    	    }
    	}

    }

}
