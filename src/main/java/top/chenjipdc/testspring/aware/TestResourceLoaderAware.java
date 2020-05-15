package top.chenjipdc.testspring.aware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import top.chenjipdc.logger.TestLogger;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-14 15:12
 */
@Component
public class TestResourceLoaderAware implements ResourceLoaderAware {
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        TestLogger.log("ResourceLoaderAware => 可获得资源加载器");
    }
}
