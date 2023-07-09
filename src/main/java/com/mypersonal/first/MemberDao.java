package com.mypersonal.first;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
    private List<Member> members = new ArrayList<>();

    private static MemberDao memberDaoInstance = null;

    private MemberDao() {
    }

    public static MemberDao getInstance() {
        if (memberDaoInstance == null) {
            memberDaoInstance = new MemberDao();
        }
        return memberDaoInstance;
    }


    public boolean create(Member member) {
        if (member != null) {
            return members.add(member);
        }
        return false;
    }

    public Member read(int id) {
        return members.stream()
                .filter(member -> member.getId() == id).findFirst().orElse(null);
    }

    public boolean update(int id, Member member) {
        int index = members.indexOf(read(id));
        return members.set(index, member) != null;
    }

    public boolean delete(int id) {
        return members.remove(read(id));
    }

    public List<Member> getAllMembers() {
        return members;
    }
}
