package springStart2.spring2.repository;

import org.springframework.stereotype.Repository;
import springStart2.spring2.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    //회원정보저장/호출 옵션이 필요함
     Member save(Member member); //멤버의 추상 메소드
     Optional<Member> findById(int id); //optional기능은 null값이 들어왔을 때 처리해준다.
     Optional<Member> findByName(String name);
     List<Member> findAll();
     void clearStore();


}
