package top.chenjipdc.testspring.init;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import top.chenjipdc.logger.TestLogger;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-14 13:53
 */
@Component
public class TestInitializing implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        TestLogger.log("InitializingBean => bean正在初始化");
    }
}
