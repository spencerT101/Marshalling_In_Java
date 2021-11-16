package com.example.iwservice;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.HttpSecurityBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth
                .inMemoryAuthentication()
                .withUser("admin").password("Admin1234").roles("ADMIN")
                .and()
                .withUser("user").password("User1234").roles("USER");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }
}
