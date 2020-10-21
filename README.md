```
java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=hello-world,receiver

java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=hello-world,sender
```

```
java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=work-queues,receiver

java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=work-queues,sender
```

```
java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=publish-subscribe,receiver

java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=publish-subscribe,sender
```
