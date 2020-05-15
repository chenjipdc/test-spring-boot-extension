package top.chenjipdc.testspring.aware;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;
import top.chenjipdc.logger.TestLogger;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-14 15:11
 */
@Component
public class TestEmbeddedValueResolverAware implements EmbeddedValueResolverAware {

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        TestLogger.log("EmbeddedValueResolverAware => ");
    }
}
