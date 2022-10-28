package com.example.springApi.payroll;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public abstract class webSecurityConfigurerAdapter {
    protected abstract void configure(HttpSecurity http)throws  Exception;
}
