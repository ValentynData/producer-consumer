package com.test.producerconsumer.repository;

import com.test.producerconsumer.entity.TimeStamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface TimeStampRepository extends JpaRepository<TimeStamp, LocalDateTime> {
}
