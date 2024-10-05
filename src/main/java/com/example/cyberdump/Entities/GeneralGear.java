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
    private Integer cost;
    private String gear_desc;
    private String gear_desc_2;

    public Integer getGear_id() {
        return gear_id;
    }

    public void setGear_id(Integer gear_id) {
        this.gear_id = gear_id;
    }

    public String getGear_name() {
        return gear_name;
    }

    public void setGear_name(String gear_name) {
        this.gear_name = gear_name;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getGear_desc() {
        return gear_desc;
    }

    public void setGear_desc(String gear_desc) {
        this.gear_desc = gear_desc;
    }

    public String getGear_desc_2() {
        return gear_desc_2;
    }

    public void setGear_desc_2(String gear_desc_2) {
        this.gear_desc_2 = gear_desc_2;
    }
}
