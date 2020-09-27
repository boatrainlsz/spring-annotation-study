package config;

import bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

//配置类就相当于beans.xml配置文件
@Configuration //告诉spring这是一个配置类
//指定扫描哪些包，还可以指定不扫描哪些组件,比如这里不扫描标注了Controller和Repository的类
@ComponentScan(basePackages = "fuckbigsmoke",
//        excludeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION,
//                        classes = {Controller.class, Repository.class})},
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})},
useDefaultFilters = false)
public class MainConfig {

    @Bean //相当于<bean>标签，id默认为方法名
    public Person person() {
        return new Person("zhangsan", 14);
    }
}
