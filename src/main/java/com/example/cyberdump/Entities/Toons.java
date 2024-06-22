package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "cyberDB_toons")
public class Toons {

    @Id
    private Integer toonId;

    public Integer getToonId() {
        return toonId;
    }

    public void setToonId(Integer toonId) {
        this.toonId = toonId;
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

    public Integer getMaxHP() {
        return max_hp  ;
    }

    public void setMaxHP(Integer maxHP) {
        this.max_hp = max_hp;
    }

    public Integer getHP() {
        return HP;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public Integer getArmorId() {
        return armorId;
    }

    public void setArmorId(Integer armorId) {
        this.armorId = armorId;
    }

    private String handle;
    private String role;
    private Integer role_level;
    private Integer max_hp;
    private Integer HP;
    private Integer armorId;





}
