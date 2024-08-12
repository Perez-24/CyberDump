package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CyberDB_toon_range_wpns")
public class ToonRangedWeapons {
    @Id
    private Long toon_id;
}
