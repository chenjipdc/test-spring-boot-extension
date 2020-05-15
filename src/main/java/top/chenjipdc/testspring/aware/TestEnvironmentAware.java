package top.chenjipdc.testspring.aware;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import top.chenjipdc.logger.TestLogger;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-14 15:11
 */
@Component
public class TestEnvironmentAware implements EnvironmentAware {

    @Override
    public void setEnvironment(Environment environment) {
        TestLogger.log("EnvironmentAware => 可获得环境");
    }
}
