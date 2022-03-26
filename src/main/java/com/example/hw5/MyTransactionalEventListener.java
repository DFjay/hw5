package com.example.hw5;

import com.example.hw5.events.MyEventTransactionalFirst;
import com.example.hw5.events.MyEventTransactionalSecond;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
@Slf4j
public class MyTransactionalEventListener {
    @TransactionalEventListener
    public void onAfterCommitEvent(MyEventTransactionalFirst event) {
        log.info("Ивент обработан " + event);
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    public void onAfterRollbackEvent(MyEventTransactionalSecond event) {
        log.info("Event обработан " + event);
    }
}
