package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {
    @Bean("personFactoryBean")
    public PersonFactoryBean personFactoryBean() throws Exception {
        return new PersonFactoryBean();
    }
}
