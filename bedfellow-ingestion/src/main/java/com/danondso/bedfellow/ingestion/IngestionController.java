package com.danondso.bedfellow.ingestion;

import com.danondso.bedfellow.dto.WhoSampledDTO;
import com.danondso.bedfellow.streams.KafkaDispatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngestionController {

    @Autowired
    private KafkaDispatch kafkaDispatch;

    @PostMapping("/send")
    public ResponseEntity<Void> sendPayload(@RequestBody WhoSampledDTO whoSampledDTO) {
        try {
            kafkaDispatch.sendMessage(whoSampledDTO);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}