package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "home_defense")
public class HomeDefense {
    @Id
    private Long def_id;
    private String defense_type;
    private String description;
    private String default_trigger;
    private String data;

    public Long getDef_id() {
        return def_id;
    }

    public void setDef_id(Long def_id) {
        this.def_id = def_id;
    }

    public String getDefense_type() {
        return defense_type;
    }

    public void setDefense_type(String defense_type) {
        this.defense_type = defense_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDefault_trigger() {
        return default_trigger;
    }

    public void setDefault_trigger(String default_trigger) {
        this.default_trigger = default_trigger;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
