package sns1.sns1.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sns1.sns1.member.model.Member;
import sns1.sns1.member.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member addMember(Member member) {
       return memberRepository.save(member);
    }

    @Override
    public List<Member> getAllMember() {
        return memberRepository.findAll();
    }

    @Override
    public Optional<Member> getMember(Long id) {
        return Optional.ofNullable(memberRepository.findById(id)).get();
    }
}
