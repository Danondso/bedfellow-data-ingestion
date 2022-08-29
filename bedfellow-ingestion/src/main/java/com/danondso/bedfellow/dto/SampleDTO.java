package com.danondso.bedfellow.dto;

import java.io.Serializable;

public record SampleDTO(String track_name, String artist, int year, String[] images) implements Serializable { }
