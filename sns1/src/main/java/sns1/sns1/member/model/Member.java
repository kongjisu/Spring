package sns1.sns1.member.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import sns1.sns1.Comment.model.Comment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private String userEmail;
    private String created;
    private String updated;

    private List<Comment> commentList = new ArrayList<Comment>();
}

