package com.example.hw5.events;

import org.springframework.context.ApplicationEvent;

public class MyEventTransactionalSecond extends ApplicationEvent {
    public MyEventTransactionalSecond(Object source) {
        super(source);
    }
}
