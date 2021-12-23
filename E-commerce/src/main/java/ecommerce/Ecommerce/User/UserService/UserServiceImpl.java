package ecommerce.Ecommerce.User.UserService;

import ecommerce.Ecommerce.User.UserModel.User;
import ecommerce.Ecommerce.User.UserRepository.UserRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepositoryJPA userRepositoryJPA;

    @Override
    public User addUser(User user) {
        return userRepositoryJPA.save(user);
    }
//빨간줄 뜨는 이유를 모르겠음
    @Override
    public List<User> getAllUser() {
        return userRepositoryJPA.findAll();
    }

    @Override
    public Optional<User> getUser(Long id) {
        return Optional.ofNullable(userRepositoryJPA.findById(id)).get();
    }


}//그다음단계가 뭐징

