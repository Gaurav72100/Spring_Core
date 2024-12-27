package com.configuration;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.entity.Address;

@Configuration
@ComponentScan(basePackages="com.configuration")
public class AppConfig {

	@Bean(initMethod="turnOn" , destroyMethod="turnOff")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Address getAddress() {
		return new Address();
	}
	
}
