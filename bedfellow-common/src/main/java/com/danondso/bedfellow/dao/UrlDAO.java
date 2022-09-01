package com.danondso.bedfellow.dao;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "url")
public class UrlDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String url;
}
