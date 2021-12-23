package ecommerce.Ecommerce.User.UserService;

import ecommerce.Ecommerce.User.UserModel.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User addUser(User user);
    List<User> getAllUser();
    Optional<User> getUser(Long id);

}
//public interface MemberService {
    //Member addMember(Member member);
    // List<Member> getAllMember();
    //Optional<Member> getMember(Long id);

//}
