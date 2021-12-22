package sns1.sns1.post.dto;

import lombok.Data;

@Data
public class IPost {
    private Long id;
    private String postName;
    private String postTitle;
    private String postText;
    private String postMainImg;
    private Long memberId;
    private String created;
    private String updated;

}
