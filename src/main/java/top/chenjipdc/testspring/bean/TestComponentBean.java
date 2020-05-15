package top.chenjipdc.testspring.bean;

import top.chenjipdc.logger.TestLogger;
import top.chenjipdc.testspring.annotation.TestComponent;

import javax.annotation.PostConstruct;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-14 21:49
 */

@TestComponent
public class TestComponentBean {

    @PostConstruct
    private void init(){
        TestLogger.log("TestComponentBean => 继承@Component注解也可以声明bean");
    }
}
