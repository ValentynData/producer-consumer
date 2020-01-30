package com.test.producerconsumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

@Service
public class ProcessService {

    static final Logger logger = LoggerFactory.getLogger(ProcessService.class);

    @Autowired
    @Qualifier("cachedThreadPool")
    ExecutorService executorService;

    public void process(Runnable runnable, int count) {
        try{
            for (int i = 0; i < count; i++) {
                executorService.execute(runnable);
            }
        }
        catch (RejectedExecutionException e) {
            logger.info("thread was interrupted");
        }
    }

}
