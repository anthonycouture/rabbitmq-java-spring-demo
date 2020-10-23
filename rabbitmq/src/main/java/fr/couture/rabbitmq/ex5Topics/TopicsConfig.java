package fr.couture.rabbitmq.ex5Topics;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("topics")
@Configuration
public class TopicsConfig {

    public final static String NAME_TOPIC = "tut.topic";

    @Bean
    public TopicExchange topic() {
        return new TopicExchange(NAME_TOPIC);
    }

    @Profile("sender")
    @Bean
    public TopicsSender sender(){
        return new TopicsSender();
    }

    @Profile("receiver")
    private static class ReceiverConfig {

        @Bean
        public TopicsReceiver receiver() {
            return new TopicsReceiver();
        }

        @Bean
        public Queue autoDeleteQueue1() {
            return new AnonymousQueue();
        }

        @Bean
        public Queue autoDeleteQueue2() {
            return new AnonymousQueue();
        }

        @Bean
        public Binding binding1a(TopicExchange topic,
                                 Queue autoDeleteQueue1) {
            return BindingBuilder.bind(autoDeleteQueue1)
                    .to(topic)
                    .with("*.orange.*");
        }

        @Bean
        public Binding binding1b(TopicExchange topic,
                                 Queue autoDeleteQueue1) {
            return BindingBuilder.bind(autoDeleteQueue1)
                    .to(topic)
                    .with("*.*.rabbit");
        }

        @Bean
        public Binding binding2a(TopicExchange topic,
                                 Queue autoDeleteQueue2) {
            return BindingBuilder.bind(autoDeleteQueue2)
                    .to(topic)
                    .with("lazy.#");
        }

    }
}
