package top.chenjipdc.testspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import top.chenjipdc.testspring.imports.TestMyImportEnable;
import top.chenjipdc.testspring.listener.TestListener;

@TestMyImportEnable
@SpringBootApplication(scanBasePackages = "top.chenjipdc.testspring")
public class TestSpringApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(TestSpringApplication.class);

//        application.addListeners(new TestListener());

        application.run(args);
    }

}
