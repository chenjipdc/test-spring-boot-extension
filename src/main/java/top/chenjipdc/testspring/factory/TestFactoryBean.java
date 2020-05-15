package top.chenjipdc.testspring.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import top.chenjipdc.testspring.test.Test;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-04-22 17:51
 */

public class TestFactoryBean implements FactoryBean<Test> {

    @Override
    public Test getObject() throws Exception {
        return new Test("wo shi pdc.");
    }

    @Override
    public Class<?> getObjectType() {
        return Test.class;
    }
}
