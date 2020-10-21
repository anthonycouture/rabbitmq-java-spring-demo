package fr.couture.rabbitmq.ex1HelloWorld;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = HelloWorldConfig.QUEUE_NAME)
public class HelloWorldReceiver {
    @RabbitHandler
    public void receive(String in){
        System.out.println(" [x] Receive '"+in+"'");
    }
}
