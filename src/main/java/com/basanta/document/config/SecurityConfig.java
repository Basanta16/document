package com.basanta.document.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {


    public PasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(){


        UserDetails adminUser= User
                .withUsername("basanta")
                .password(passwordEncoder().encode("password"))
                .roles("ADMIN")
                .build();


        UserDetails normalUser= User.withUsername("basanta1")
                .password(passwordEncoder().encode("password"))
                .roles("NORMAL")
                .build();



      InMemoryUserDetailsManager inMemoryUserDetailsManager=  new InMemoryUserDetailsManager(adminUser, normalUser);

      return inMemoryUserDetailsManager;

    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{

        httpSecurity.csrf().disable()
                .authorizeHttpRequests()

                .requestMatchers("/document/admin/**")
                .hasRole("ADMIN")

                .requestMatchers("/document/user/**")
                .hasRole("NORMAL")

                .requestMatchers("/document/public/**")
                .permitAll()
                .and()
                .formLogin();

                return httpSecurity.build();

    }
}
