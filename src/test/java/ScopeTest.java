import config.ScopeConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        Object bean = context.getBean("person");
        Object bean1 = context.getBean("person");
        System.out.println(bean1 == bean);
        System.out.println(bean);
        context.close();
    }
}
