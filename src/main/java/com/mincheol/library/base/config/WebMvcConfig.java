package com.mincheol.library.base.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Slf4j
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }

}
