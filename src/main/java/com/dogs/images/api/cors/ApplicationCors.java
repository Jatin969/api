package com.dogs.images.api.cors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("cors.origin.active")
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
