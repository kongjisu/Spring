package sns1.sns1.post.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sns1.sns1.member.repository.MemberRepository;
import sns1.sns1.post.model.Post;
import sns1.sns1.post.repository.PostRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

   @Autowired
   private PostRepository postRepository;

   @Override
   public Post addPost(Post post) {
      return postRepository.save(post);
   }

   @Override
   public List<Post> getAllPost() {
      return postRepository.findAll();
   }

   @Override
   public Optional<Post> getMember(Long id) {
      return Optional.ofNullable(postRepository.findById(id)).get();
   }
}
