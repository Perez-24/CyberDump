package com.example.cyberdump.Entities.ToonRelated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "toon_wpns")
public class ToonWeapons {

    @Id
    private Long toon_id;
    private Integer wpn_id;

    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public Integer getWpn_id() {
        return wpn_id;
    }

    public void setWpn_id(Integer wpn_id) {
        this.wpn_id = wpn_id;
    }
}
