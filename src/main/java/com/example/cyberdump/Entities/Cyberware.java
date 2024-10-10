package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cyberware")
public class Cyberware {

    @Id
    private Long cyberware_id;
    private String cyberware_name;

}
