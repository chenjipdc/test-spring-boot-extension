package top.chenjipdc.testspring.aware;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import top.chenjipdc.logger.TestLogger;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-14 15:12
 */
@Component
public class TestApplicationEventPublisherAware implements ApplicationEventPublisherAware {
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        TestLogger.log("ApplicationEventPublisherAware => 可获取事件发布器");
    }
}
