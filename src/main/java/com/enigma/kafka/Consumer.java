package com.enigma.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "kafka_training", groupId = "bni_internship")
    public void consumeMessage(String message) {
        System.out.println(message);
    }
}
