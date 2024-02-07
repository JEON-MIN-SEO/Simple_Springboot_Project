package firstsimplepro.simplespring.repository;

import firstsimplepro.simplespring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{
    private Map<Long,Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member; // オブジェクト参照アドレスを返す（戻り値）
    }

    @Override
    public Optional<Member> findbyid(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findbyName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny(); //
    }

    @Override
    public List<Member> findall() {
        return new ArrayList<>(store.values());
    }
}
