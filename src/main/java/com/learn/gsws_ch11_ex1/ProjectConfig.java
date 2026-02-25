package com.learn.gsws_ch11_ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public WebClient webClient() {
        return WebClient
                .builder()
.build();
    }
}
