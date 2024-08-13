package com.example.cyberdump.Entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;


@Entity
@Table(name = "toons")
public class Toons {
    @Id
    private Long toon_id;
    private String handle;
    private String role;
    private Integer role_level;
    private Integer max_hp;
    private Integer hp;

    private Integer armor_id;

    public Long getToon_id() {
        return toon_id;
    }
    public void setToon_id(Long toonId) {
        this.toon_id = toonId;
    }
    public String getHandle() {
        return handle;
    }
    public void setHandle(String handle) {
        this.handle = handle;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public Integer getRole_level() {
        return role_level;
    }
    public void setRole_level(Integer role_level) {
        this.role_level = role_level;
    }
    public Integer getMax_hp() {
        return max_hp  ;
    }
    public void setMax_hp(Integer max_hp) {
        this.max_hp = max_hp;
    }
    public Integer getHp() {
        return hp;
    }
    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getArmor_id() {
        return armor_id;
    }

    public void setArmor_id(Integer armor_id) {
        this.armor_id = armor_id;
    }




}
