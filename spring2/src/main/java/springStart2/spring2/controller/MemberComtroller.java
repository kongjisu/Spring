package springStart2.spring2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springStart2.spring2.service.MemberService;

@Controller
public class MemberComtroller {
    private final MemberService memberService;

    @Autowired
    public MemberComtroller(MemberService memberService) {
        this.memberService = memberService;
    }
}
