package com.test.producerconsumer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "counter")
public class TimeStamp implements Serializable {

    @Id
    @Column(name = "reach_counter_limit_time")
    public LocalDateTime reachCounterLimitTime;

    public TimeStamp() {
    }

    public TimeStamp(LocalDateTime reachCounterLimitTime) {
        this.reachCounterLimitTime = reachCounterLimitTime;
    }
}
