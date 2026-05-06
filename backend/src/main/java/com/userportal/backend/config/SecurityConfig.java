package com.userportal.backend.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.http.HttpMethod;


@Configuration
public class SecurityConfig
{

    @Bean
    public SecurityFilterChain securityFilterChain( HttpSecurity http ) throws Exception
    {
        // Disable CSRF (API mode)
        http.csrf( csrf -> csrf.disable())
            .cors( Customizer.withDefaults())
            .headers( headers -> headers.frameOptions( frame -> frame.disable()))
            .authorizeHttpRequests( auth -> auth
                .requestMatchers( HttpMethod.OPTIONS, "/**" ).permitAll()
                .requestMatchers( "/auth/**" ).permitAll()
                .requestMatchers( HttpMethod.POST, "/api/leads" ).permitAll()
                .requestMatchers( "/h2-console/**" ).permitAll()
                .requestMatchers( "/error" ).permitAll()
                .anyRequest().authenticated()
            )
            // Disable default login page
            .formLogin( form -> form.disable() )
            .httpBasic( basic -> basic.disable() );

        return http.build();
    }


    @Bean
    CorsConfigurationSource corsConfigurationSource()
    {
        CorsConfiguration configuration = new CorsConfiguration();

        configuration.setAllowedOrigins( List.of( "http://localhost:5173" ) );
        configuration.setAllowedMethods( List.of( "GET", "POST", "PUT",
        "DELETE", "OPTIONS" ) );
        configuration.setAllowedHeaders( List.of( "*" ) );

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration( "/**", configuration );

        return source;
    }

}
