package fr.couture.rabbitmq.ex3PublishSubscribe;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("publish-subscribe")
@Configuration
public class PublishSubscribeConfig {

    public static final String FANOUT_NAME = "tut.fanout";

    @Bean
    public FanoutExchange fanout(){
        return new FanoutExchange(FANOUT_NAME);
    }

    @Profile("sender")
    @Bean
    public PublishSubscribeSender sender(){
        return new PublishSubscribeSender();
    }


    @Profile("receiver")
    private static class ReceiverConfig {

        @Bean
        public Queue autoDeleteQueue1() {
            return new AnonymousQueue();
        }

        @Bean
        public Queue autoDeleteQueue2() {
            return new AnonymousQueue();
        }

        @Bean
        public Binding binding1(FanoutExchange fanout,
                                Queue autoDeleteQueue1) {
            return BindingBuilder.bind(autoDeleteQueue1).to(fanout);
        }

        @Bean
        public Binding binding2(FanoutExchange fanout,
                                Queue autoDeleteQueue2) {
            return BindingBuilder.bind(autoDeleteQueue2).to(fanout);
        }

        @Bean
        public PublishSubcribeReceiver receiver() {
            return new PublishSubcribeReceiver();
        }
    }

}
