package com.test.producerconsumer.counter;

import java.util.concurrent.atomic.AtomicInteger;


public class Counter {

    protected static AtomicInteger counter = new AtomicInteger(50);

}
