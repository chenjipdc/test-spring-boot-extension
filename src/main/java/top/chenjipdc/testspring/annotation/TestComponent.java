package top.chenjipdc.testspring.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-14 21:47
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@Inherited
@ComponentScan("com.github")
public @interface TestComponent {

    String value() default "";
}
