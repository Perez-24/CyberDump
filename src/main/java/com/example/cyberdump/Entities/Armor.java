package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "armor")
public class Armor {

    @Id
    private Long armor_id;
    private String armor_type;
    private Integer sp_max;
    private Integer sp;
    private String armor_penalty;
    private Integer cost;


}
