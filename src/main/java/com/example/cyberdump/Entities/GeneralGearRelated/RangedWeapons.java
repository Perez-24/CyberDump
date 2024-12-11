package com.example.cyberdump.Entities.GeneralGearRelated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "range_wpns")
public class RangedWeapons {
    @Id
    private Long toon_id;
    private Long wpn_id;
    private String wpn_name;
    private String wpn_type;
    private Integer num_hands;
    private String damage;
    private Integer ROF;
    private Integer can_be_concealed;
    private Integer cost;
    private Integer wpn_skill;
    private Integer magazine;
    private Integer current_magazine;
    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public Long getWpn_id() {
        return wpn_id;
    }

    public void setWpn_id(Long wpn_id) {
        this.wpn_id = wpn_id;
    }

    public String getWpn_name() {
        return wpn_name;
    }

    public void setWpn_name(String wpn_name) {
        this.wpn_name = wpn_name;
    }

    public String getWpn_type() {
        return wpn_type;
    }

    public void setWpn_type(String wpn_type) {
        this.wpn_type = wpn_type;
    }

    public Integer getNum_hands() {
        return num_hands;
    }

    public void setNum_hands(Integer num_hands) {
        this.num_hands = num_hands;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public Integer getROF() {
        return ROF;
    }

    public void setROF(Integer ROF) {
        this.ROF = ROF;
    }

    public Integer getCan_be_concealed() {
        return can_be_concealed;
    }

    public void setCan_be_concealed(Integer can_be_concealed) {
        this.can_be_concealed = can_be_concealed;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getWpn_skill() {
        return wpn_skill;
    }

    public void setWpn_skill(Integer wpn_skill) {
        this.wpn_skill = wpn_skill;
    }

    public Integer getMagazine() {
        return magazine;
    }

    public void setMagazine(Integer magazine) {
        this.magazine = magazine;
    }

    public Integer getCurrent_magazine() {
        return current_magazine;
    }

    public void setCurrent_magazine(Integer current_magazine) {
        this.current_magazine = current_magazine;
    }
}
