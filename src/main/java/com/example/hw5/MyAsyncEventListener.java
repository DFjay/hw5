package com.example.hw5;

import com.example.hw5.events.MyEventAsync;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyAsyncEventListener implements ApplicationListener<MyEventAsync> {

    @Override
    @Async
    @SneakyThrows
    public void onApplicationEvent(MyEventAsync event) {
        Thread.sleep(10000);
        log.info("Ивент обработан " + event);
    }
}
