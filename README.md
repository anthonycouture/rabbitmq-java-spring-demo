## 01 Hello world
![Hello world](./img/01-Hello.png)
```
java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=hello-world,receiver

java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=hello-world,sender
```

## 02 Work Queues
![Work Queues](./img/02-WorkQueues.png)
```
java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=work-queues,receiver

java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=work-queues,sender
```

## 03 Publish/Subscribe
![Publish/Subscribe](./img/03-Publish-Subscribe.png)
```
java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=publish-subscribe,receiver

java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=publish-subscribe,sender
```

## 04 Routing
![Routing](./img/04-Routing.png)
```
java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=routing,receiver

java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=routing,sender
```

## 05 Topics
![Topics](./img/05-Topics.png)
```
java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=topics,receiver

java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=topics,sender
```

## 06 RPC
![RPC](./img/06-RPC.png)
```
java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=rpc,server

java -jar ./target/rabbitmq-1.0.jar --spring.profiles.active=rpc,client
```