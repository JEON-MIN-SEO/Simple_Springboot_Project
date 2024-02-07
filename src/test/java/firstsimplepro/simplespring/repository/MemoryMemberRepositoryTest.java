package firstsimplepro.simplespring.repository;

import firstsimplepro.simplespring.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        Member member = new Member();
        member.setName("Spring Test Name");

        repository.save(member);
        Member result = repository.findbyid(member.getId()).get();
        //System.out.println("result = "+(member == result));
        //Assertions.assertEquals(member , result );
        assertThat(member).isEqualTo(result);
    }
}
