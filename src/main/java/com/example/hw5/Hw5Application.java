package com.example.hw5;

import com.example.hw5.events.MyEvent;
import com.example.hw5.events.MyEventAsync;
import com.example.hw5.events.MyEventTransactionalFirst;
import com.example.hw5.events.MyEventTransactionalSecond;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw5Application {
    static MyEventPublisher publisher;

    public Hw5Application(MyEventPublisher publisher) {
        Hw5Application.publisher = publisher;
    }

    public static void main(String[] args) {
        SpringApplication.run(Hw5Application.class, args);
        MyEventAsync secondEvent = new MyEventAsync("");
        MyEvent firstEvent = new MyEvent("");
        MyEventTransactionalSecond fourthEvent = new MyEventTransactionalSecond("");
        MyEventTransactionalFirst thirdEvent = new MyEventTransactionalFirst("");

        publisher.publishEventAsync(secondEvent);
        publisher.publishEvent(firstEvent);
        publisher.publishEventWithTransaction(thirdEvent);
        publisher.publishEventWithTransactionButError(fourthEvent);
    }

}
