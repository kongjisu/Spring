package spring.boot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import spring.boot.post.User;
import spring.boot.post.repository.UserRepository;

import java.util.List;

public class UserServiceImpo implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpo(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public User addUser(User user){
        return userRepository.save(user);
    }
    @Override
    public List>User



}
