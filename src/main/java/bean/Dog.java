package bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Scope(scopeName = "prototype")
public class Dog {
    public Dog() {
        System.out.println("Dog构造器方法执行！");
    }

    @PostConstruct
    public void init() {
        System.out.println("Dog自定义初始化方法执行！");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Dog自定义销毁方法执行！");
    }
}
