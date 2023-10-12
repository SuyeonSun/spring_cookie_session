package com.example.demo.controller;

import com.example.demo.service.MemberService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;


@RestController
public class CookieController {
    MemberService memberService = new MemberService();


    @RequestMapping("/setCookie")
    public String setCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("myCookie", "cookieValue");
        cookie.setMaxAge(3600); // 1 hour

        response.addCookie(cookie);
        return "successfully set cookie";
    }


    @GetMapping("/checkCookie")
    public String checkCookie(@CookieValue(name = "myCookie", required = false) String cookie) {
        if (cookie != null) return cookie;
        else return "no cookie yet";

    }
}
