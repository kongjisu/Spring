package sns1.sns1.Comment.dto;

import lombok.Data;

@Data
public class IComment {
    private Long id;
    private int created;
    private String CommentMainImg;
    private String CommentName;
    private String CommentText;
    private String CommentTitle;
    private String CommentUpdate;



}
