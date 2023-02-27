package com.dogs.api.cors;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ConfigurationProperties(prefix="cors.origin.active")
@Configuration
public class ApplicationCors {
    String goLiveOrigin;

    public ApplicationCors() {

    }

    @Bean("origins")
    public String getGoLiveOrigin() {
        return goLiveOrigin;
    }

    public void setGoLiveOrigin(String goLiveOrigin) {
        this.goLiveOrigin = goLiveOrigin;
    }

}
