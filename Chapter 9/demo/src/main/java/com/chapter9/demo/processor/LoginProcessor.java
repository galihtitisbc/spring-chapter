package com.chapter9.demo.processor;

import com.chapter9.demo.service.LoggedUserManagementService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private String username = "koko";
    private String password = "12345";
    private LoggedUserManagementService loggedUserManagementService;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean login(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            loggedUserManagementService.setUsername(username);
            return true;
        }
        return false;
    }
}
