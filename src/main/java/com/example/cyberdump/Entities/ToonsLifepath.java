package com.example.cyberdump.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CyberDB_toons_lifepaths")
public class ToonsLifepath {

    @Id
    private Long toonId;
    private String cultural_origins;


    public Long getToonId() {
        return toonId;
    }
    public void setToonId(Long toonId) {
        this.toonId = toonId;
    }
    public String getCultural_origins() {
        return cultural_origins;
    }
    public void setCultural_origins(String cultural_origins) {
        this.cultural_origins = cultural_origins;
    }



}
