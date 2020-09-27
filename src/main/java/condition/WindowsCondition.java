package condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        ClassLoader classLoader = conditionContext.getClassLoader();
        Environment environment = conditionContext.getEnvironment();
        String osName = environment.getProperty("os.name");
        if (osName.contains("Windows")) return true;
        return false;
    }
}
