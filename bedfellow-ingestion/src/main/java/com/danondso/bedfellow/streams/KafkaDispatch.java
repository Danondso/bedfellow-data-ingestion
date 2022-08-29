package com.danondso.bedfellow.streams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaDispatch {
    @Value(value = "${spring.kafka.topicName}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(Object payload) {
        kafkaTemplate.send(topicName, payload);
    }
}
