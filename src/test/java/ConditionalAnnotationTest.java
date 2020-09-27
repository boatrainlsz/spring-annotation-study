import bean.Person;
import config.ConditionalConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class ConditionalAnnotationTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        Map<String, Person> personMap = context.getBeansOfType(Person.class);
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
