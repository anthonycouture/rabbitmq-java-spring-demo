package fr.couture.rabbitmq.ex1HelloWorld;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("hello-world")
public class HelloWorldConfig {

    public final static String QUEUE_NAME = "hello";

    @Bean
    public Queue hello(){
        return new Queue(QUEUE_NAME);
    }

    @Profile("receiver")
    @Bean
    public HelloWorldReceiver receiver(){
        return new HelloWorldReceiver();
    }

    @Profile("sender")
    @Bean
    public HelloWordSender sender(){
        return new HelloWordSender();
    }

}
