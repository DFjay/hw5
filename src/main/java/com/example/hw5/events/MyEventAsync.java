package com.example.hw5.events;

import org.springframework.context.ApplicationEvent;

public class MyEventAsync extends ApplicationEvent {
    public MyEventAsync(Object source) {
        super(source);
    }
}
