import bean.Person;
import config.ConditionalConfig;
import config.FactoryBeanConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class FactoryBeanConfigTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        //这里获取到的是Person
        Object bean = context.getBean("personFactoryBean");
        //加&符号才能获取到真正的personFactoryBean
        Object bean1 = context.getBean("&personFactoryBean");
        System.out.println(bean.getClass());
        System.out.println(bean1.getClass());
    }
}
