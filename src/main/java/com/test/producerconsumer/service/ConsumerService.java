package com.test.producerconsumer.service;

import com.test.producerconsumer.counter.CounterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;

@Service
public class ConsumerService implements Runnable {

    static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @Autowired
    @Qualifier("cachedThreadPool")
    ExecutorService executorService;

    @Autowired
    CounterService counterService;

    @Override
    public void run() {
        while (true) {
            if (counterService.getCounter() == 0 || counterService.getCounter() == 100) {
                executorService.shutdownNow();
                break;
            }
            counterService.decrementCounter();
            logger.info(String.format("counter is %s, at %s, by consumer %s", counterService.getCounter(), LocalDateTime.now(), Thread.currentThread().getName()));
        }

    }

}
