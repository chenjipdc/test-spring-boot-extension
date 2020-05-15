package top.chenjipdc.testspring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import top.chenjipdc.logger.TestLogger;
import top.chenjipdc.testspring.bean.TestBean;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-04-22 17:41
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof TestBean){
            TestLogger.log("BeanPostProcessor => bean创建完初始化前，可以搞事情");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof TestBean){
            TestLogger.log("BeanPostProcessor => bean实例化完初始化后，也可以搞事情");
        }
        return bean;
    }
}
