package sns1.sns1.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sns1.sns1.post.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
}
