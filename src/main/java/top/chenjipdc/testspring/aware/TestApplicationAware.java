package top.chenjipdc.testspring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import top.chenjipdc.logger.TestLogger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-04-25 13:32
 */
@Component
public class TestApplicationAware implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        TestLogger.log("ApplicationContextAware => 可获取context");
        this.applicationContext = applicationContext;
    }


    @PostConstruct
    public void init(){
//        Object bean = applicationContext.getBean("test");
//        System.out.println(bean);
    }

    @PreDestroy
    public void destroy(){

    }
}
