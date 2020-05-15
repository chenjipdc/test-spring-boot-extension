package top.chenjipdc.testautoconfiguration.imports;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Import;
import top.chenjipdc.logger.TestLogger;
import top.chenjipdc.testautoconfiguration.nospringbean.NoSpringBean;

import javax.annotation.PostConstruct;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-15 10:01
 */
@Import(NoSpringBean.class)
public class TestImports implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        TestLogger.log("TestImports => aware");
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    private void init(){
        NoSpringBean noSpringBean = applicationContext.getBean(NoSpringBean.class);
        TestLogger.log("Import导入的bean => " + noSpringBean);
    }

}
