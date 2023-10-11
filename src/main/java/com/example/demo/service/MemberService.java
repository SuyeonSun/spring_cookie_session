package com.example.demo.service;

import com.example.demo.domain.LoginDto;
import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberRepository memberRepository;
    public Member login(String id) {
        Member member = memberRepository.findById(id);
        return member;
    }
}
