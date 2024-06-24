package com.example.cyberdump.Entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;


@Entity
@Table(name = "cyberDB_toons")
public class Toons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long toonId;
    private String handle;
    private String role;
    private Integer role_level;
    private Integer max_hp;
    private Integer hp;

    public Long getToonId() {
        return toonId;
    }
    public void setToonId(Long toonId) {
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




}
