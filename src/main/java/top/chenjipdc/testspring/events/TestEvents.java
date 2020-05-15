package top.chenjipdc.testspring.events;

import org.springframework.boot.context.event.*;
import org.springframework.context.event.EventListener;
import top.chenjipdc.logger.TestLogger;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-04-28 10:04
 */
public class TestEvents {

    @EventListener({ApplicationStartingEvent.class})
    public void starting(ApplicationStartingEvent event) {
        TestLogger.log("开始应用启动事件");
    }

    @EventListener({ApplicationStartedEvent.class})
    public void started(ApplicationStartedEvent event) {
        TestLogger.log("应用启动完成事件");
    }

    @EventListener({ApplicationReadyEvent.class})
    public void ready(ApplicationReadyEvent event) {
        TestLogger.log("应用已经启动完，准备接收数据事件");
    }

    @EventListener({ApplicationPreparedEvent.class})
    public void prepared(ApplicationPreparedEvent event) {
        TestLogger.log("应用准备好了事件");
    }

    @EventListener({ApplicationFailedEvent.class})
    public void failed(ApplicationFailedEvent event) {
        TestLogger.log("应用启动失败事件");
    }

}