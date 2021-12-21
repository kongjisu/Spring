package spring.boot.Service;

import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User addUser(User user);
    List<User> getAll();
    Optional<User> getUser(int id);

}
}
