package com.danondso.bedfellow.dao;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "artist")
public class ArtistDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String[] images;
}
