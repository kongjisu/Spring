package sns1.sns1.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sns1.sns1.member.model.Member;

public interface MemberRepository extends JpaRepository<Member,Long>{
}
