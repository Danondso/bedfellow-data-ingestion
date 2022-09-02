package com.danondso.bedfellow.dao;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sample")
public class SampleDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long trackId;
    private Long aristId;
}
