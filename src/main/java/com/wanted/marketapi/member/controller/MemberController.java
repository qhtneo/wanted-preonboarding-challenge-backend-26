package com.wanted.marketapi.member.controller;

import com.wanted.marketapi.member.domain.Member;
import com.wanted.marketapi.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable("id") UUID id) {
        return memberService.getMemberById(id);
    }
    // TODO findByUsername 만들기

    @PostMapping
    public Member addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }
}
