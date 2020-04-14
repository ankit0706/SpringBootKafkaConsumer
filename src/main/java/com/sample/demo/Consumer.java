package com.sample.demo;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "jsonTopic", groupId = "group_id")
    public void consume(User user) throws IOException {
        logger.info("user name = " + user.getName());
        logger.info("user age = " + user.getAge());
        System.out.println("Received response = " + user);
    }
}
