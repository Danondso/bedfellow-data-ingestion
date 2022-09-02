package com.danondso.bedfellow.dao;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "track")
public class TrackDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Long artistId;
    private Integer year;
}
