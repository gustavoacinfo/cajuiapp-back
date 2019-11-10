/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ifnmg.cajuiapp.config;

import com.br.ifnmg.cajuiapp.security.JWTAuthenticationFilter;
import com.br.ifnmg.cajuiapp.security.JWTAuthorizationFilter;
import com.br.ifnmg.cajuiapp.security.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
/**
 *
 * @author Gustavo
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Autowired
    private UserDetailsService userDetailsService;
    
    @Autowired
    private JWTUtil jwtUtil;
    
    private static final String[] PUBLIC_MATCHERS = {
                        "/usuario/**"
    };
    
    private static final String[] PUBLIC_MATCHERS_POST = {
                       // "/usuario/**"
    };
    
    private static final String[] PUBLIC_MATCHERS_GET = {
                        "/avaliacao/**",
                        "/falta/**",
                        "/registro/**",
                        "/matricula/**",
                        "/oferta/**",
                        "/professoroferta/**",
                       // "/notaavaliacao/**"
    };
    
    @Override
	protected void configure(HttpSecurity http) throws Exception {
            
//            if (Arrays.asList(env.getActiveProfiles()).contains("test")) {
//            http.headers().frameOptions().disable();
//        }
            
                http.cors().and().csrf().disable();
		http.authorizeRequests()
                        .antMatchers(HttpMethod.POST, PUBLIC_MATCHERS_POST).permitAll()
                        .antMatchers(HttpMethod.GET, PUBLIC_MATCHERS_GET).permitAll()
                        .antMatchers(PUBLIC_MATCHERS).permitAll()
			.anyRequest().authenticated();
                http.addFilter(new JWTAuthenticationFilter(authenticationManager(), jwtUtil));
                http.addFilter(new JWTAuthorizationFilter(authenticationManager(), jwtUtil, userDetailsService));
                http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        }
        
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }
    
        @Bean
	CorsConfigurationSource corsConfigurationSource() {
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
		return source;
	}
    
        @Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
    
}
