package config;

import bean.Person;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonFactoryBean implements FactoryBean<Person> {
    public Person getObject() throws Exception {
        return new Person("wangyu", 11);
    }

    public Class<?> getObjectType() {
        return Person.class;
    }
}
