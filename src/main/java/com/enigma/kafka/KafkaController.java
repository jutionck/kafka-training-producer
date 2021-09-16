package com.enigma.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    Producer producer;

    @PostMapping("/publish")
    public void messageToTopic(@RequestParam("message") String message) {

        this.producer.sendMessage(message);
    }
}
