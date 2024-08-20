package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cyberdb_toon_range_wpns")
public class ToonRangedWeapons {
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
    private Integer reserve_basic;
    private Integer reserve_ap;
    private Integer reserve_biotoxin;
    private Integer reserve_emp;
    private Integer reserve_expansive;
    private Integer reserve_flashbang;
    private Integer reserve_incendiary;
    private Integer reserve_poison;
    private Integer reserve_rubber;
    private Integer reserve_sleep;
    private Integer reserve_smart;
    private Integer reserve_smoke;
    private Integer reserve_teargas;
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

    public Integer getReserve_basic() {
        return reserve_basic;
    }

    public void setReserve_basic(Integer reserve_basic) {
        this.reserve_basic = reserve_basic;
    }

    public Integer getReserve_ap() {
        return reserve_ap;
    }

    public void setReserve_ap(Integer reserve_ap) {
        this.reserve_ap = reserve_ap;
    }

    public Integer getReserve_biotoxin() {
        return reserve_biotoxin;
    }

    public void setReserve_biotoxin(Integer reserve_biotoxin) {
        this.reserve_biotoxin = reserve_biotoxin;
    }

    public Integer getReserve_emp() {
        return reserve_emp;
    }

    public void setReserve_emp(Integer reserve_emp) {
        this.reserve_emp = reserve_emp;
    }

    public Integer getReserve_expansive() {
        return reserve_expansive;
    }

    public void setReserve_expansive(Integer reserve_expansive) {
        this.reserve_expansive = reserve_expansive;
    }

    public Integer getReserve_flashbang() {
        return reserve_flashbang;
    }

    public void setReserve_flashbang(Integer reserve_flashbang) {
        this.reserve_flashbang = reserve_flashbang;
    }

    public Integer getReserve_incendiary() {
        return reserve_incendiary;
    }

    public void setReserve_incendiary(Integer reserve_incendiary) {
        this.reserve_incendiary = reserve_incendiary;
    }

    public Integer getReserve_poison() {
        return reserve_poison;
    }

    public void setReserve_poison(Integer reserve_poison) {
        this.reserve_poison = reserve_poison;
    }

    public Integer getReserve_rubber() {
        return reserve_rubber;
    }

    public void setReserve_rubber(Integer reserve_rubber) {
        this.reserve_rubber = reserve_rubber;
    }

    public Integer getReserve_sleep() {
        return reserve_sleep;
    }

    public void setReserve_sleep(Integer reserve_sleep) {
        this.reserve_sleep = reserve_sleep;
    }

    public Integer getReserve_smart() {
        return reserve_smart;
    }

    public void setReserve_smart(Integer reserve_smart) {
        this.reserve_smart = reserve_smart;
    }

    public Integer getReserve_smoke() {
        return reserve_smoke;
    }

    public void setReserve_smoke(Integer reserve_smoke) {
        this.reserve_smoke = reserve_smoke;
    }

    public Integer getReserve_teargas() {
        return reserve_teargas;
    }

    public void setReserve_teargas(Integer reserve_teargas) {
        this.reserve_teargas = reserve_teargas;
    }
}
