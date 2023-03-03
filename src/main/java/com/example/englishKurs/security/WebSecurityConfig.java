package com.example.englishKurs.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.beans.Encoder;
import java.util.Base64;
@EnableWebSecurity
@Configuration
public class WebSecurityConfig {
    @Bean
    public InMemoryUserDetailsManager manager(){
        UserDetails userDetails = User.builder().password("pass").username("admin").roles("USER", "ADMIN").build();
        UserDetails userDetails2 = User.builder().password("pass2").username("user2").roles("USER").build();

        return new InMemoryUserDetailsManager(userDetails,userDetails2);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity security) throws Exception{
        return security
                .csrf().disable()
                .authorizeHttpRequests().requestMatchers("/users/**").permitAll()
                .and()
                .authorizeHttpRequests().requestMatchers("/cards/**").hasRole("ADMIN")
                .and()
                .formLogin().disable()
                .build();
    }
}
