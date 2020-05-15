package top.chenjipdc.testspring.destroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;
import top.chenjipdc.logger.TestLogger;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-14 13:56
 */
@Component
public class TestDisposableBean implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        TestLogger.log("DisposableBean => 销毁bean");

    }
}
