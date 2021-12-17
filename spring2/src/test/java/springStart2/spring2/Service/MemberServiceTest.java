package springStart2.spring2.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springStart2.spring2.domain.Member;
import springStart2.spring2.repository.MemberRepository;
import springStart2.spring2.repository.MemberRepositoryImpl;
import springStart2.spring2.service.MemberService;

public class MemberServiceTest {


    MemberService memberService;
    MemberRepository memberRepository;

    public void  beforeEach(){

        memberRepository = new MemberRepositoryImpl();
        memberService = new MemberService(memberRepository);

    }


    @Test
    void join() throws Exception{

        Member member1 =new Member();
        member1.setName("Union");
       int saveId = memberService.join(member1);
       Member result = memberRepository.findById(saveId).get();
        Assertions.assertEquals(member1.getName(),"test");


    }

    @Test
    void findMemberAll(){
        Member member1 =new Member();
        member1.setName("Union");
        memberService.join(member1);

        Member member2 =new Member();
        member2.setName("Union");
        memberService.join(member2);

        Member member3 = new Member();
        member3.setName("Union");
        memberService.join(member3);

    }
}
