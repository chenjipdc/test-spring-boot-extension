package top.chenjipdc.testspring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;
import top.chenjipdc.logger.TestLogger;
import top.chenjipdc.testspring.bean.TestInstantiationBean;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-29 14:10
 */
@Component
public class TestInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    /**
     * The returned bean object may be a proxy to use instead of the target bean
     *
     * @param beanClass
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass.isAssignableFrom(TestInstantiationBean.class)){
            TestLogger.log("InstantiationAwareBeanPostProcessor => bean BeforeInstantiation，可以在这里创建我们自己的bean，后面不会调用AfterInstantiation跟BeforeInitialization了");
            return new TestInstantiationBean();
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (bean instanceof TestInstantiationBean){
            TestLogger.log("InstantiationAwareBeanPostProcessor => bean AfterInstantiation");
        }
        return true;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof TestInstantiationBean){
            TestLogger.log("InstantiationAwareBeanPostProcessor => bean BeforeInitialization，可以搞事情");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof TestInstantiationBean){
            TestLogger.log("InstantiationAwareBeanPostProcessor => bean AfterInitialization，也可以搞事情");
        }
        return bean;
    }

}
