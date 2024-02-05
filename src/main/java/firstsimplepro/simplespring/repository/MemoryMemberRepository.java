package firstsimplepro.simplespring.repository;

import firstsimplepro.simplespring.domain.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository{
    private Map<Long,Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findbyid(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findbyName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findall() {
        return null;
    }
}
