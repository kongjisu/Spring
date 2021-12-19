package springStart2.spring2.repository;

import org.springframework.stereotype.Repository;
import springStart2.spring2.domain.Member;

import java.util.*;
@Repository
public class MemberRepositoryImpl implements MemberRepository {

    private static Map<Integer, Member> store = new HashMap<>();
    private static int sequence = 0;


    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member); //메모리에 데이터가 하나 들어간다.
        return member;
    }

    @Override
    public Optional <Member> findById(int id) {
        return Optional.ofNullable(store.get(id)) ;
    }

    @Override
    public  Optional <Member> findByName(String name) generate{ //이름 검색시 필터가 필요함
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();//람다식 //findAny란 옵셔널의 기능 이름이 없어도 그냥 실행햐 라는 것
    } //외으는게 아니라 구조에 따른 코드임

    @Override
    public List<Member> findAll() {

        return new ArrayList<>(store.values());
    }

    @Override
    public void clearStore() {
        store.clear();
    }


}
