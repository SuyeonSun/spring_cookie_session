package com.example.demo.controller;

import com.example.demo.domain.LoginDto;
import com.example.demo.domain.Member;
import com.example.demo.service.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberController {
    MemberService memberService = new MemberService();

    /*
    @RequestMapping("/setCookie")
    public String setCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("myCookie", "cookieValue");
        cookie.setMaxAge(3600); // 1 hour

        response.addCookie(cookie);
        return "successfully added cookie";
    }
    */

    @PostMapping("/login")
    public void login(@RequestBody LoginDto loginDto) {
        Member member = memberService.login(loginDto.getId());

    }
}
