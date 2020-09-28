package config;

import bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfig {

    @Bean
    @Scope("prototype")
    public Person person() {
        return new Person("11", 11);
    }
}
