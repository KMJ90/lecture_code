package com.ohgiraffers.common;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

// 부가적인 기능들
//@Controller
//@Service
//@Repository

@Component
public class MemberDAO {

    private final Map<Integer, MemberDTO> memberMap;

    public MemberDAO() {
        memberMap = new HashMap<>();

        memberMap.put(1, new MemberDTO(1, "user01", "pass01", "판다"));
        memberMap.put(2, new MemberDTO(2, "user02", "pass02", "다람쥐"));
    }
    public MemberDTO selectMember(int sequence) {
        return memberMap.get(sequence);
    }

    public boolean insertMember(MemberDTO newMember) {
        int before = memberMap.size();

        memberMap.put(newMember.getSequence(), newMember);

        int after = memberMap.size();

        return after > before ? true : false;
    }
}
