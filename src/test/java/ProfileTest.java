import config.ProfileConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class ProfileTest {

    /**
     * 1.通过虚拟机参数指定 -Dspring.profiles.active=test
     */
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProfileConfig.class);
        String[] names = context.getBeanNamesForType(DataSource.class);
        for (String name : names) {
            System.out.println(name);
        }
        context.close();
    }

    /**
     * 2.也可以用代码的方式
     */
    @Test
    public void test01() {
        //创建一个空的上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //设置要激活的环境
        context.getEnvironment().setActiveProfiles("test", "rel");
        //注册主配置类
        context.register(ProfileConfig.class);
        //刷新容器
        context.refresh();
        String[] names = context.getBeanNamesForType(DataSource.class);
        for (String name : names) {
            System.out.println(name);
        }
        context.close();
    }
}
