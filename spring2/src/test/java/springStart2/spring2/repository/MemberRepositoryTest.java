package springStart2.spring2.repository;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import springStart2.spring2.domain.Member;

import java.util.List;

public class MemberRepositoryTest {

    MemberRepository repository = new MemberRepositoryImpl();
    @AfterEach
        public void afterEach(){
            repository.clearStore();

    }
    @Test
    void save() {
        Member member = new Member();
        member.setName("Union");

        repository.save(member);
        Member result = repository.findById(member.getId()).get();
        Assertions.assertThat(result).isEqualTo(member);

    }
    @AfterEach

    @Test
    void findByName() {
        Member member1 = new Member();
        member1.setName("Union");

        repository.save(member1);

        Member member2 = new Member();
        member2.setName("Busan");

        repository.save(member2);
        Member result = repository.findByName("Busan").get();
        Assertions.assertThat(result).isEqualTo(member2);
    }

    @Test
    void findAll() {
        Member member1 = new Member();
        member1.setName("Union");

        repository.save(member1);

        Member member2 = new Member();
        member2.setName("Busan");

        repository.save(member2);


        List<Member> result = repository.findAll();
        Assertions.assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void validateDuplicateMember() {
        Member member3 = new Member();
        member3.setName("sky");

        repository.save(member3);

        Member member4 = new Member();
        member4.setName("blue");

        repository.save(member4);
        Member result = repository.findByName("Blue").get();
        Assertions.assertThat(result).isEqualTo(member4);
    }
}
