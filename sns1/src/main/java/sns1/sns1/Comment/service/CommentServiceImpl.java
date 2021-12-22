package sns1.sns1.Comment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sns1.sns1.Comment.model.Comment;
import sns1.sns1.Comment.repository.CommentRepository;
import sns1.sns1.member.repository.MemberRepository;

import java.util.List;
import java.util.Optional;
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> getAllComment() {
        return commentRepository.findAll();
    }

    @Override
    public Optional<Comment> getComment(Long Id) {
        return Optional.ofNullable(commentRepository.findById(id)).get();
    }
}
