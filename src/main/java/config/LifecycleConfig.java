package config;

import bean.Car;
import bean.Dog;
import bean.MyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//为了说明bean的生命周期

/**
 * 创建->初始化->销毁
 * 可以自定义初始化和销毁
 * 1.
 */
@Configuration
public class LifecycleConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }

    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}
