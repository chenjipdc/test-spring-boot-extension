package top.chenjipdc.testspring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import top.chenjipdc.logger.TestLogger;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-04-22 17:40
 */
@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        TestLogger.log("BeanFactoryPostProcessor => 获取beanFactory，可对bean Definition修改");
    }
}
