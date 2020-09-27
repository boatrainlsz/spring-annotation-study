package bean;

import org.springframework.context.annotation.Scope;

//@Scope(scopeName = "prototype")
public class Car {
    public Car() {
        System.out.println("构造器方法执行！");
    }

    public void init() {
        System.out.println("自定义初始化方法执行！");
    }

    public void destroy() {
        System.out.println("自定义销毁方法执行！");
    }
}
