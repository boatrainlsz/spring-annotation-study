import config.LifecycleConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifecycleConfig .class);
//        Object bean = context.getBean("car");
        context.close();
    }
}
