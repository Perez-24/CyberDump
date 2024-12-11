package com.example.cyberdump.Entities.GeneralGearRelated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "armor")
public class Armor {

    @Id
    private Long armor_id;
    private String armor_type;
    private String armor_desc;
    private Integer sp_max;
    private String armor_penalty;
    private Integer cost;

    public Long getArmor_id() {
        return armor_id;
    }

    public void setArmor_id(Long armor_id) {
        this.armor_id = armor_id;
    }

    public String getArmor_type() {
        return armor_type;
    }

    public void setArmor_type(String armor_type) {
        this.armor_type = armor_type;
    }

    public String getArmor_desc() {
        return armor_desc;
    }

    public void setArmor_desc(String armor_desc) {
        this.armor_desc = armor_desc;
    }

    public Integer getSp_max() {
        return sp_max;
    }

    public void setSp_max(Integer sp_max) {
        this.sp_max = sp_max;
    }

    public String getArmor_penalty() {
        return armor_penalty;
    }

    public void setArmor_penalty(String armor_penalty) {
        this.armor_penalty = armor_penalty;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
