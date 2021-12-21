package spring.boot.post.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boot.post.Post;
@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}

