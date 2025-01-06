package com.Spring_Config.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.Spring_Config")
@PropertySource("classpath:application.properties")
public class AppConfig {

	
}
