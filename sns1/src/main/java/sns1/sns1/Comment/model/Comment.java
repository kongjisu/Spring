package sns1.sns1.Comment.model;

import lombok.*;
import sns1.sns1.member.model.Member;
import sns1.sns1.post.model.Post;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
public class Comment { // GenerationType



    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int created;
    private String CommentMainImg;
    private String CommentName;
    private String CommentText;
    private String CommentTitle;
    private String CommentUpdate;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

}
