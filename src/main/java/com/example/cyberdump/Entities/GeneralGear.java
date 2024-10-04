package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "general_gear")
public class GeneralGear {
    @Id
    private Integer gear_id;
    private String gear_name;
    private Integer cost;private String gear_desc;
    private String gear_desc_2;
}
