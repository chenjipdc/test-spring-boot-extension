package top.chenjipdc.testspring.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import top.chenjipdc.logger.TestLogger;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-04-28 10:40
 */
public class TestListener implements ApplicationListener {


    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        TestLogger.log("接收到事件：" + event.getClass());
    }
}
