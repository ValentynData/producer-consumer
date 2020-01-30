package com.test.producerconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class ExecutorServiceConfig {

    @Bean("cachedThreadPool")
    //@Scope(value="prototype")
    public ExecutorService cachedThreadPool() {
        return Executors.newCachedThreadPool();
    }


}
