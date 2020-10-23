package fr.couture.rabbitmq.ex6RPC;

import com.rabbitmq.client.RpcClient;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("rpc")
@Configuration
public class RPCConfig {

    public final static String NAME_EXCHANGE = "tut.rpc";
    public final static String NAME_QUEUE = "tut.rpc.request";

    @Profile("client")
    private static class ClientConfig {

        @Bean
        public DirectExchange exchange() {
            return new DirectExchange(NAME_EXCHANGE);
        }

        @Bean
        public RPCClient client() {
            return new RPCClient();
        }

    }

    @Profile("server")
    private static class ServerConfig {

        @Bean
        public Queue queue() {
            return new Queue(NAME_QUEUE);
        }

        @Bean
        public DirectExchange exchange() {
            return new DirectExchange(NAME_EXCHANGE);
        }

        @Bean
        public Binding binding(DirectExchange exchange,
                               Queue queue) {
            return BindingBuilder.bind(queue)
                    .to(exchange)
                    .with("rpc");
        }

        @Bean
        public RPCServer server() {
            return new RPCServer();
        }

    }
}
