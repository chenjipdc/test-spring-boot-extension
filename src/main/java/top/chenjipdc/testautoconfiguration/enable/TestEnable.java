package top.chenjipdc.testautoconfiguration.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-15 13:36
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(TestRegistrar.class)
public @interface TestEnable {

}
