package com.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	@KafkaListener(topics = "test", groupId = "test-group")
	public void listener(String message) {
	    System.out.println("Received Message in group test-group: " + message);
	}
}

