import config.ScopeConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {

    @Test
    public void test() {
        //多实例情况下，在getBean时才会new实例，而单实例情况下，默认在容器创建时就会new实例(除非指定@Lazy注解)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        Object bean = context.getBean("person");
        Object bean1 = context.getBean("person");
        System.out.println(bean1 == bean);
        System.out.println(bean);
        context.close();
    }
}
