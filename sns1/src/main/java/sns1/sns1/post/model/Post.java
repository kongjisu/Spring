package sns1.sns1.post.model;

import lombok.*;
import sns1.sns1.Comment.model.Comment;
import sns1.sns1.member.model.Member;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Entity //@Entity의 기능 테이블을 매핑해주는 것(테이블 쿼리를 설정해주는 것)
@NoArgsConstructor

public class Post {

    @Id //@Id의 기능은 기본키를(Primary Key)를 지정해준다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedVlaue의 기능은 primary key를 생성하는 법을 지정한다.
    private Long id;
    private String postName;
    private String postTitle;
    private String postText;
    private String postMainImg;
    @ManyToOne //일대 다관계를 의미한다.
    @JoinColumn(name = "member_id")//<- name을 포린키로 만들어 주는 것
    private Member member;
    private String created;
    private String updated;

    @OneToMany(mappedBy = "post")
    private List<Comment> commentList= new ArrayList<>();

    public Member getMember() {
        return member;
    }

    @Builder //@Bulider lombok에서 사용하는 빌드 패턴을 사용하여 객체를 생성할 수 있으며 객체 생성 후 setter를 통한 접근을 제한 할수 있어서 불변형 객체를 만들 수 있다.

    public Post(String postName, String postTitle, String postText, String postMainImg, Member member, String created, String updated) {
        this.postName = postName;
        this.postTitle = postTitle;
        this.postText = postText;
        this.postMainImg = postMainImg;
        this.member = member;
        this.created = created;
        this.updated = updated;
    }
}
