package com.jeiker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

//        http.formLogin()  // 表单验证
        http.httpBasic()    // 默认弹窗验证
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();
    }
}
