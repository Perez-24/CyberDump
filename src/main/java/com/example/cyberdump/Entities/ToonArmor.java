package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "toon_armr")
public class ToonArmor {

    @Id
    private Long toon_id;
    private Integer armor_id;

    private Integer current_head;
    private Integer current_body;
    private Integer current_shield;
    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public Integer getArmor_id() {
        return armor_id;
    }

    public void setArmor_id(Integer armor_id) {
        this.armor_id = armor_id;
    }

    public Integer getCurrent_head() {
        return current_head;
    }

    public void setCurrent_head(Integer head) {
        this.current_head = head;
    }

    public Integer getCurrent_body() {
        return current_body;
    }

    public void setCurrent_body(Integer body) {
        this.current_body = body;
    }

    public Integer getCurrent_shield() {
        return current_shield;
    }

    public void setCurrent_shield(Integer shield) {
        this.current_shield = shield;
    }

}
