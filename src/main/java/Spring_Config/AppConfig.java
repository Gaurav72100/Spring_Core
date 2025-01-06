package Spring_Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="Spring_Config")

@PropertySource("classpath:application.properties")
public class AppConfig {

	
}
