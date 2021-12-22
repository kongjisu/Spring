package sns1.sns1.post.service;

import sns1.sns1.member.model.Member;
import sns1.sns1.post.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    Post addPost(Post post);
    List<Post> getAllPost();
    Optional<Post> getMember(Long id);



}
