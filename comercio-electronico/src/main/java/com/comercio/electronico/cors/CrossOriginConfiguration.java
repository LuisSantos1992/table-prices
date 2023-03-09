package com.comercio.electronico.cors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CrossOriginConfiguration {
    @Value("${application.cors-allowed}")
    private String[] corsAllowed;

    @Value("${application.exposed-headers}")
    private String[] exposedHeaders;

    /**
     * Configuration for allow origin from:
     * front end localhost, dev, qa and Kong environments.
     */

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry
                        .addMapping("/**")
                        .allowedOrigins(corsAllowed)
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .exposedHeaders(exposedHeaders);
            }
        };
    }
}
