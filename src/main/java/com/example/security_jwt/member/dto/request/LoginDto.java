package com.example.security_jwt.member.dto.request;

import lombok.Data;

@Data
public class LoginDto {
    private String username;
    private String password;

    public boolean isNotValid() {
        return username == null || password == null || username.trim().length() == 0 || password.trim().length() == 0;
    }
}
