package com.test.producerconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProducerConsumerApplication {

	@RequestMapping("/test")
	public String test() {
		return "Server is OK";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProducerConsumerApplication.class, args);
	}

}
