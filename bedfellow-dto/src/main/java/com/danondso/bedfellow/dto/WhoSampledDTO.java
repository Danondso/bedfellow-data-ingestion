package com.danondso.bedfellow.dto;

import java.io.Serializable;
import java.util.ArrayList;

public record WhoSampledDTO(String url, ArrayList<SampleDTO> samples) implements Serializable { }


