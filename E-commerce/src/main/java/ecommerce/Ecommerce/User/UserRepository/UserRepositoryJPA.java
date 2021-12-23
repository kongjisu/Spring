package ecommerce.Ecommerce.User.UserRepository;

import ecommerce.Ecommerce.User.UserModel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryJPA extends JpaRepository <User, Long>{

}
//public interface MemberRepository extends JpaRepository<Member,Long> {
//} <-이 부분 참고함!

//그그그그그 JPA 인스턴스 extends? 그걸 리포지토리에 넣는거였음!
///..그리고 리포지토리 네임도 좀 이상한데??