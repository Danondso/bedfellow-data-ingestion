package com.danondso.bedfellow.streams;

import com.danondso.bedfellow.dto.WhoSampledDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "bedfellow-ingestion-adapter", groupId = "bedfellow-ingestion-persist")
    public void listenGroupBedfellowIngestion(WhoSampledDTO whoSampledDTO) {
        System.out.println("Here's the message" + whoSampledDTO);
    }
}
