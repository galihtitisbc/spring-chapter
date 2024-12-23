package com.chapter9.demo.controller;

import com.chapter9.demo.processor.LoginProcessor;
import com.chapter9.demo.service.LoggedUserManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private LoginProcessor loginProcessor;
    private LoggedUserManagementService loggedUserManagementService;

    public LoginController(LoginProcessor loginProcessor, LoggedUserManagementService loggedUserManagementService) {
        this.loginProcessor = loginProcessor;
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/")
    public String loginPage() {
        String username = loggedUserManagementService.getUsername();
        if (username != null) {
            System.out.println(username);
            return "index";
        }
        return "redirect:/";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam String username, @RequestParam String password, Model model) {
        boolean loggedIn = loginProcessor.login(username, password);
        if (loggedIn) {
            model.addAttribute("message", "You Are now Loggedin");
        } else {
            model.addAttribute("message", "You Not Login");
        }
        return "login";
    }
}
