package com.example.hw5.events;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }
}
