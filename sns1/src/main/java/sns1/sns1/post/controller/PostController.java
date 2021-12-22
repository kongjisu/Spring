package sns1.sns1.post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sns1.sns1.member.model.Member;
import sns1.sns1.member.service.MemberService;
import sns1.sns1.post.dto.IPost;
import sns1.sns1.post.model.Post;
import sns1.sns1.post.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/post")

public class PostController {

    @Autowired
    private PostService postService;
    @Autowired
    private MemberService memberService;

    @PostMapping("/add")
    public Post add(@RequestBody IPost iPost)
    {
        Member member1 = memberService.getMember(iPost.getMemberId()).get();
        Post post = new Post(
                iPost.getPostName(),
                iPost.getPostTitle(),
                iPost.getPostText(),
                iPost.getPostMainImg(),
                member1,
                iPost.getCreated(),
                iPost.getUpdated()
        );
        return postService.addPost(post);

    }
    @GetMapping("/getAll")
    public List<Post> getAll(){

        return postService.getAllPost();
    }

    @GetMapping("/get/{id}")
    public Post get(@PathVariable Long id){
        return postService.getAllPost(id).get();
    }
}
