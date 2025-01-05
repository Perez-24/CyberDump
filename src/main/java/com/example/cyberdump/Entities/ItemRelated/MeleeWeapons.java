package com.example.cyberdump.Entities.ItemRelated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mle_wpns")
public class MeleeWeapons {

    @Id
    private Long toon_id;
    private Long wpn_id;
    private String wpn_name;
    private Integer num_hands;
    private String damage;
    private Integer ROF;
    private Integer can_be_concealed;
    private Integer cost;
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
}
