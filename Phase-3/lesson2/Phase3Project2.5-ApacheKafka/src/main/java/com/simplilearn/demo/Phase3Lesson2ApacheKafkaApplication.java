package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
@EnableKafka
@SpringBootApplication
@ComponentScan("com.simplilearn.demo")
public class Phase3Lesson2ApacheKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Phase3Lesson2ApacheKafkaApplication.class, args);
	}
	
	@KafkaListener(topics="GENERAL",groupId="group-id")
	public void listne(String message) {
		System.out.println("Message  received: "+message);
	}
}
