package com.example.springApi.Authentication;

import lombok.Data;

@Data
public class Login {
    private String usernameOrEmail;
    private String password;

}
