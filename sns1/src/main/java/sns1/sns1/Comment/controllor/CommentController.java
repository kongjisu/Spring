package sns1.sns1.Comment.controllor;

import lombok.Builder;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sns1.sns1.Comment.dto.IComment;
import sns1.sns1.Comment.model.Comment;
import sns1.sns1.Comment.service.CommentService;
import sns1.sns1.member.service.MemberService;
import sns1.sns1.post.model.Post;

@NoArgsConstructor
@RestController
@RequestMapping("comment")
public class CommentController {
    @Autowired
    private CommentService commentService;
    @Autowired
    private MemberService memberService;

    @Autowired

  @PostMapping("/add")
    public Comment add(@RequestBody IComment iComment)

    return commentService.addComment(
            new Comment(
                    iComment.getComText(),
                    postService.getPost(iComment.);
    )
            )

  public CommentService getCommentService() {
    return commentService.addComment();
  }

  @Builder

}

