package top.chenjipdc.testspring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenjipdc@gmail.com
 * @date 2020-05-14 22:37
 */
@Configuration
public class TestConfiguration {

    @Bean
    public User user(){
        return new User("pdc-test-configuration");
    }

    public static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
