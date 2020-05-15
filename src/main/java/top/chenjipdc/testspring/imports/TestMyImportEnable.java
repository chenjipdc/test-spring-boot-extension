package top.chenjipdc.testspring.imports;

import org.springframework.context.annotation.Import;
import top.chenjipdc.testspring.registrar.TestMyImportRegistrar;

import java.lang.annotation.*;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-15 13:50
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(TestMyImportRegistrar.class)
public @interface TestMyImportEnable {

    String value() default "TestMyImportEnable";

    String packages() default "top.chenjipdc";

    int a() default 1;

}
