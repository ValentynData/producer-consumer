package com.test.producerconsumer.controller;

import com.test.producerconsumer.counter.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter")
public class CounterController {

    @Autowired
    CounterService counterService;

    @PostMapping("/change")
    public ResponseEntity addProducerConsumer(@RequestParam int counter) {
        counterService.setCounter(counter);
        return new ResponseEntity(HttpStatus.OK);
    }

}
