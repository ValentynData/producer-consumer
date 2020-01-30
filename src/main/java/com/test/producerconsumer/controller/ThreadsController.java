package com.test.producerconsumer.controller;

import com.test.producerconsumer.service.ProcessService;
import com.test.producerconsumer.service.ConsumerService;
import com.test.producerconsumer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;

@RestController
@RequestMapping("/threads")
@Validated
public class ThreadsController {

    @Autowired
    ProducerService producer;

    @Autowired
    ConsumerService consumer;

    @Autowired
    ProcessService abstractService;

    @PostMapping("/add")
    public ResponseEntity addProducerConsumer(@RequestParam @Min(0) int producerCount, @RequestParam @Min(0) int consumerCount) {
        abstractService.process(producer, producerCount);
        abstractService.process(consumer, consumerCount);
        return new ResponseEntity(HttpStatus.CREATED);
    }

}
