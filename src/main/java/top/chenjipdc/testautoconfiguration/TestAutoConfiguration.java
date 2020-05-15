package top.chenjipdc.testautoconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import top.chenjipdc.logger.TestLogger;
import top.chenjipdc.testautoconfiguration.enable.TestEnable;
import top.chenjipdc.testautoconfiguration.imports.TestImports;
import top.chenjipdc.testautoconfiguration.my.TestMyBean;

import javax.annotation.PostConstruct;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-14 21:10
 *
 * 自动注入配置类
 *
 * 为什么需要自动注入？
 * spring boot默认会扫描跟启动类同一个包下的bean，但是不同的包下的bean是扫描不出来的；
 * 所以需要自动装配，只需配置到spring.factories的 org.springframework.boot.autoconfigure.EnableAutoConfiguration 里即可完成自动装配
 *
 * 还有一种办法是通过@ScanPackages扫描包。
 */
@TestEnable
@Import(TestImports.class)
@Configuration
public class TestAutoConfiguration {

    @PostConstruct
    private void init(){
        TestLogger.log("TestAutoConfiguration => construct");
    }

    @Bean
    public TestMyBean testMyBean(){
        return new TestMyBean();
    }

}
