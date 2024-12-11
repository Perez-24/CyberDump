package com.example.cyberdump.Entities.GeneralGearRelated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cyberdeck_hardware")
public class CyberdeckHardware {

    @Id
    private Long cyberdeck_hardware_id;
    private String cyberdeck_hardware_name;
    private Integer option_slots;
    private String description;
    private String cost;

    public Long getCyberdeck_hardware_id() {
        return cyberdeck_hardware_id;
    }

    public void setCyberdeck_hardware_id(Long cyberdeck_hardware_id) {
        this.cyberdeck_hardware_id = cyberdeck_hardware_id;
    }

    public String getCyberdeck_hardware_name() {
        return cyberdeck_hardware_name;
    }

    public void setCyberdeck_hardware_name(String cyberdeck_hardware_name) {
        this.cyberdeck_hardware_name = cyberdeck_hardware_name;
    }

    public Integer getOption_slots() {
        return option_slots;
    }

    public void setOption_slots(Integer option_slots) {
        this.option_slots = option_slots;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
