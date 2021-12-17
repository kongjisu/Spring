package springStart2.spring2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springStart2.spring2.domain.Member;
import springStart2.spring2.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

import java.util.*;

@Service
public class MemberService {
//private MemberRepository memberRepository = new MemberRepositoryImpl
    private final MemberRepository memberRepository;
 //public int addMember(Member member){
 // memberRepository.memberSave(member);
  //  return member.getID()
 // }
    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    public int join(Member member){
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();

    }
    public List<Member> findMember (){
        return memberRepository.findAll();

    }

    public Optional<Member> findOne(int memberId){
        return memberRepository.findById(memberId);

    }
    public void validateDuplicateMember(Member member){
        if(member!=null) {
            memberRepository.findByName(member.getName())
                    .ifPresent(member1 -> {
                        throw new IllegalStateException("이미 존재합니다.");
                    });
        }
    }

}
