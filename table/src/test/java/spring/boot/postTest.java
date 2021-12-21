package spring.boot;

import org.apache.catalina.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import spring.boot.Service.UserService;
import spring.boot.post.repository.UserRepository;

public class postTest {
@Autowired  UserService UserService;
@Autowired UserRepository UserRepository;

    @Test
    public void addSave() throws Exception{

    User User1 = new User("")
    User1.setId(1L);
        System.out.println("user1="+ user1);

        userService.addUser(uaer1);

    }
}
