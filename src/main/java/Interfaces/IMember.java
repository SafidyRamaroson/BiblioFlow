package Interfaces;

import Entity.Member;
import java.util.List;

public interface IMember {
    void create(Member member){}
    List<Member> getMembers(){}
    Member getOneMember(Integer id){}
    void deleteMember(Integer id){}
    List<Member> searchMember(String name){}
}
