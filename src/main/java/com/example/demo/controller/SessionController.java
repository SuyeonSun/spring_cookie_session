package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class SessionController {
    @GetMapping("/setSession")
    public String setSession(HttpSession session) {
        session.setAttribute("name", "sun");

        return "successfully set session";
    }

    @GetMapping("/getSession")
    public String getSession(HttpSession session) {
        String name = (String) session.getAttribute("name"); // name이라는 이름의 session이 존재하는가?
        if (name == null) return "no session yet";
        else return name;
    }

    @GetMapping("/sessionInterceptorTest")
    public void sessionInterceptorTest() {
        System.out.println("====== sessionInterceptorTest ======");
    }

    // 아래 두 test api 모두에서 session이 있다면 출력하고 없다면 redirect 되어야 한다.
    // test api 1
    // test api 2
}
