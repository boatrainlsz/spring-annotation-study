import bean.Person;
import config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        //没有注解的时候，通过xml文件配置bean
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);

        //有注解的时候，通过配置类配置bean
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person1 = context1.getBean("person", Person.class);
        System.out.println(person1);
        String[] names = context1.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
