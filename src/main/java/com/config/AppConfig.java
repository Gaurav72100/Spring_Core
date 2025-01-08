package com.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com")
public class AppConfig {

	@Autowired
	Environment environment;

	private final String URL = "url";
	private final String USER = "dbuser";
	private final String DRIVER = "driver";
	private final String PASSWORD = "dbpassword";

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/gaurav");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("578038");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return driverManagerDataSource;
}
}
