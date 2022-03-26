package com.example.hw5;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@RequiredArgsConstructor
@Slf4j
public class MyEventPublisher {
    final ApplicationEventPublisher publisher;

    @Transactional
    public void publishEvent(ApplicationEvent event) {
        publisher.publishEvent(event);
        log.info("Publish event: " + event);
    }

    @Transactional
    public void publishEventAsync(ApplicationEvent event) {
        publisher.publishEvent(event);
        log.info("Publish event: " + event);
    }

    @Transactional
    public void publishEventWithTransaction(ApplicationEvent event) {
        publisher.publishEvent(event);
        log.info("Publish event: " + event);
    }

    @Transactional
    public void publishEventWithTransactionButError(ApplicationEvent event) {
        publisher.publishEvent(event);
        //throw new RuntimeException("error");
        log.info("Publish event: " + event);
    }
}
