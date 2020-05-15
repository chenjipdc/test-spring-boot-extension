package top.chenjipdc.testspring.bean;


import org.springframework.stereotype.Component;
import top.chenjipdc.logger.TestLogger;

import javax.annotation.PostConstruct;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-04-22 17:56
 */
@Component(value = "test_bean")
public class TestBean {

    @PostConstruct
    public void init(){
        TestLogger.log("TestBean => construct");
    }
}
