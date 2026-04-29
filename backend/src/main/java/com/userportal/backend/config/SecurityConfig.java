package com.userportal.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig
{

    @Bean
    public SecurityFilterChain securityFilterChain( HttpSecurity http ) throws Exception
    {
        // Disable CSRF (API mode)
        http.csrf( csrf -> csrf.disable() )
            .headers( headers -> headers.frameOptions( frame -> frame.disable()))
            .authorizeHttpRequests( auth -> auth
                // Allow login/register
                .requestMatchers( "/auth/**" ).permitAll()
                .requestMatchers( "/api/leads" ).permitAll()
                .requestMatchers( "/h2-console/**" ).permitAll()
                .anyRequest().authenticated()
            )
            // Disable default login page
            .formLogin( form -> form.disable() )
            .httpBasic( basic -> basic.disable() );

        return http.build();
    }

}
