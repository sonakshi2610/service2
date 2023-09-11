package com.craftdemo.service2.configuration;

import com.craftdemo.requestfilter.WebSecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfig {
    @Autowired
    private CustomAuthEntryPoint customAuthEntryPoint;

    @Bean
    @Order
    public SecurityFilterChain apiSecurityFilterChain(HttpSecurity http) throws Exception {
        return super.apiSecurityFilterChain(http);
    }
}