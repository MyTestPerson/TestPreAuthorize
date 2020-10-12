package com.testpreauthorize.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.testpreauthorize.security"})
public class RootConfig {
}