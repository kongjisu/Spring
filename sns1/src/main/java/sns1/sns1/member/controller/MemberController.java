package sns1.sns1.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sns1.sns1.member.model.Member;
import sns1.sns1.member.service.MemberService;

import java.util.List;

@RestController
@RequestMapping("/member")

public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/add")
    public Member add(@RequestBody Member member) {
        return memberService.addMember(member);
    }

    @GetMapping("/getAll")
    public List<Member> getAllMember(){
        return memberService.getAllMember();
    }
}
