package Interfaces;

import Entity.Member;
import java.util.List;

public interface IMember {
    void create(Member member);
    List<Member> getMembers();
    Member getOneMember(String id);
    void deleteMember(String id);
    List<Member> searchMember(String name);
}
