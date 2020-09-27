package config;

import bean.Person;
import condition.LinuxCondition;
import condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

//为了说明@Conditional的用法
@Configuration
//可以加在类上，说明满足这个条件，这个类中配置的所有bean注册才生效
@Conditional({WindowsCondition.class})
public class ConditionalConfig {

    @Bean(name = "bill")
    @Conditional({WindowsCondition.class})
    public Person person01() {
        return new Person("bill gates", 100);
    }

    @Bean(name = "linus")
    @Conditional({LinuxCondition.class})
    public Person person02() {
        return new Person("linus", 99);
    }
}
