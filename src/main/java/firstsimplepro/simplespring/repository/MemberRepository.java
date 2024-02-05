package firstsimplepro.simplespring.repository;

import firstsimplepro.simplespring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository { //インターフェース宣言だけする
    Member save(Member member);
    Optional<Member> findbyid(Long id);
    Optional<Member> findbyName(String name);
    List<Member>findall();
}
