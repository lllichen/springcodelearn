package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lichen@daojia.com on 2017-6-9.
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    public MessageService mockMessageService(){
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }


}
