package com.danondso.bedfellow.service;

import com.danondso.bedfellow.dao.SampleDAO;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    public SampleDAO transformSample() {
        return new SampleDAO();
    }
}
