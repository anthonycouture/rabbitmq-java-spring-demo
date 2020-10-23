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

```
java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=routing,receiver

java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=routing,sender
```

```
java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=topics,receiver

java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=topics,sender
```

```
java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=rpc,server

java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=rpc,client
```