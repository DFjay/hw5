package com.example.hw5.events;

import org.springframework.context.ApplicationEvent;

public class MyEventTransactionalFirst extends ApplicationEvent {
    public MyEventTransactionalFirst(Object source) {
        super(source);
    }
}
