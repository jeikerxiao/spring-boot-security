package com.jeiker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

    // 加密方式
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // 1. UsernamePasswordAuthenticationFilter
        // 2. BasicAuthenticationFilter
        // 3. ... ...
        // 4. ExceptionTranslationFilter
        // 5. FilterSecurityInterceptor

        http.formLogin()  // 表单验证
//        http.httpBasic()    // 默认弹窗验证
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();
    }
}
