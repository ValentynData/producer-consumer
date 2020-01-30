package com.test.producerconsumer.counter;

import com.test.producerconsumer.entity.TimeStamp;
import com.test.producerconsumer.repository.TimeStampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static com.test.producerconsumer.counter.Counter.counter;

@Service
public class CounterService {

    @Autowired
    TimeStampRepository timeStampRepository;

    public int getCounter() {
        return counter.get();
    }

    public void setCounter(int value) {
        counter.set(value);
    }

    public void incrementCounter() {
        int count = counter.incrementAndGet();
        if (count == 0 || count == 100) {
            timeStampRepository.save(new TimeStamp(LocalDateTime.now()));
        }
    }

    public void decrementCounter() {
        counter.decrementAndGet();
    }

}
