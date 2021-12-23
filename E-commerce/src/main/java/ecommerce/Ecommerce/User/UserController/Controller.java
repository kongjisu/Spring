package ecommerce.Ecommerce.User.UserController;

import ecommerce.Ecommerce.User.UserModel.User;
import ecommerce.Ecommerce.User.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user") //api주소 설정 기본 디렉토리 설정하기
public class Controller {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User add(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/getAll")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

}

