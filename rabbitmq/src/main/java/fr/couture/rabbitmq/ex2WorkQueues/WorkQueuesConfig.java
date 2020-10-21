package fr.couture.rabbitmq.ex2WorkQueues;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("work-queues")
@Configuration
public class WorkQueuesConfig {

    public final static String QUEUE_NAME = "hello";

    @Bean
    public Queue hello(){
        return new Queue(QUEUE_NAME);
    }

    @Profile("sender")
    @Bean
    public WorkQueuesSender sender(){
        return new WorkQueuesSender();
    }

    @Profile("receiver")
    private static class ReceiverConfig{
        @Bean
        public WorkQueuesReceiver receiver1(){
            return new WorkQueuesReceiver(1);
        }

        @Bean
        public WorkQueuesReceiver receiver2(){
            return new WorkQueuesReceiver(2);
        }
    }
}
