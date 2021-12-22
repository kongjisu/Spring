package sns1.sns1.Comment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sns1.sns1.Comment.model.Comment;

//public interface MemberRepository extends JpaRepository<Member,Long>{
//}
public interface CommentRepository  extends JpaRepository<Comment,Long> {
}
