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
    private String cyberware_type;
    private String install_type;
    private String description;
    private String cost;
    private String HL;


    public Long getCyberware_id() {
        return cyberware_id;
    }

    public void setCyberware_id(Long cyberware_id) {
        this.cyberware_id = cyberware_id;
    }

    public String getCyberware_name() {
        return cyberware_name;
    }

    public void setCyberware_name(String cyberware_name) {
        this.cyberware_name = cyberware_name;
    }
}
