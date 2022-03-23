package com.example.springsecurity_cors.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import java.util.List;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests()
                .anyRequest().permitAll();
        
        http.cors(c->{
            CorsConfigurationSource cors=r->{
                CorsConfiguration coresConf=new CorsConfiguration();
                coresConf.setAllowedOrigins(List.of("*"));
                coresConf.setAllowedMethods(List.of("Get","Post"));
                return coresConf;
            };
        c.configurationSource(cors);
        });
    }
}
