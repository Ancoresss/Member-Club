package ua.savko.yalantistest.service;

import ua.savko.yalantistest.model.Member;

import java.util.List;

public interface MemberService {
    void addMember(Member member);
    List<Member> getMembers();
    boolean isUserExistWithEmail(String email);
}
