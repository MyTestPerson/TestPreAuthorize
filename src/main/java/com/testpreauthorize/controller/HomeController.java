package com.testpreauthorize.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String home () {
        return "/home";
    }


//    @PreAuthorize("principal.username == 'user'")
    @PreAuthorize("isAuthenticated()")
//    @Secured("ROLE_USER")
    @GetMapping(value = "/user")
    public String user () {
        return "/user";

    }


    @GetMapping(value = "/login")
    public String loginGet () {
        return "/login";
    }

    @PostMapping(value = "/login")
    public String loginPost () {
        return "redirect:/user";
    }


}
