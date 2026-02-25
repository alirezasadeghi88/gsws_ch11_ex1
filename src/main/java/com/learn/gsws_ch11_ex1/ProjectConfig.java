package com.learn.gsws_ch11_ex1;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(
basePackages = "com.learn")
public class ProjectConfig {
}
