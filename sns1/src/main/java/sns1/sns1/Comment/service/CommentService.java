package sns1.sns1.Comment.service;

import sns1.sns1.Comment.model.Comment;
import sns1.sns1.member.model.Member;
import sns1.sns1.post.model.Post;

import java.util.List;
import java.util.Optional;

 public interface CommentService {
   // Comment addComment(Comment comment);
   // List<Comment> getAllMember();
    //Optional<Comment> getMember(Long id);
    Comment addComment(Comment comment);
    List<Comment> getAllComment();
    Optional<Comment> getComment(Long Id);

}
