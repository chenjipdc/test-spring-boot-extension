package top.chenjipdc.testspring.aware;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;
import top.chenjipdc.logger.TestLogger;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-14 15:13
 */
@Component
public class TestMessageSourceAware implements MessageSourceAware {
    @Override
    public void setMessageSource(MessageSource messageSource) {
        TestLogger.log("MessageSourceAware => 可获得message source");
    }
}
