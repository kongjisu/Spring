package spring.boot.post;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="name")
    private Long id;
    private String postName;
    private String postTitle;
    private String postContentText;
    private String getPostTitleImg;
    private String postCreate;
    private String postUpdate;
    @ManyToOne //일대다 관계
    @JoinColumn(name = "user_id")//포린키 붙은 쪽은 일대다에서 다이다.
    private User user;

    public User getUser() {
        return user;
    }

}
