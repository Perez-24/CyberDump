package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cyberware")
public class NetrunnerPrograms {

    @Id
    private Long program_id;
    private String programName;

}
