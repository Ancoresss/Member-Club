package ua.savko.yalantistest.service;

import org.springframework.stereotype.Service;
import ua.savko.yalantistest.model.Member;

import java.util.LinkedList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    private List<Member> memberList = new LinkedList<>();

    @Override
    public void addMember(Member member) {
        memberList.add(member);
    }

    @Override
    public List<Member> getMembers() {
        return memberList;
    }

    @Override
    public boolean isUserExistWithEmail(String email) {
        for(int i = 0; i < memberList.size(); i++) {
            if(memberList.get(i).getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}
