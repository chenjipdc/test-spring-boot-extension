package top.chenjipdc.testspring.init;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import top.chenjipdc.logger.TestLogger;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-14 14:31
 */
public class TestApplicationContextInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        TestLogger.log("ApplicationContextInitializer => 上下文初始化");
    }
}
