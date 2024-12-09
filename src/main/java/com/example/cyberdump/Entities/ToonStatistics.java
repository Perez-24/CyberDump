package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "toon_statistics")
public class ToonStatistics {

    @Id
    private Long toon_id;
    private Integer intelligence;
    private Integer willpower;
    private Integer cool;
    private Integer empathy;
    private Integer technique;
    private Integer reflexes;
    private Integer luck;
    private Integer body;
    private Integer dexterity;
    private Integer movement;

    private Integer derived_hp;
    private Integer derived_humanity;

    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getWillpower() {
        return willpower;
    }

    public void setWillpower(Integer willpower) {
        this.willpower = willpower;
    }

    public Integer getCool() {
        return cool;
    }

    public void setCool(Integer cool) {
        this.cool = cool;
    }

    public Integer getEmpathy() {
        return empathy;
    }

    public void setEmpathy(Integer empathy) {
        this.empathy = empathy;
    }

    public Integer getTechnique() {
        return technique;
    }

    public void setTechnique(Integer technique) {
        this.technique = technique;
    }

    public Integer getReflexes() {
        return reflexes;
    }

    public void setReflexes(Integer reflexes) {
        this.reflexes = reflexes;
    }

    public Integer getLuck() {
        return luck;
    }

    public void setLuck(Integer luck) {
        this.luck = luck;
    }

    public Integer getBody() {
        return body;
    }

    public void setBody(Integer body) {
        this.body = body;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getMovement() {
        return movement;
    }

    public void setMovement(Integer movement) {
        this.movement = movement;
    }

    public Integer getDerived_hp() {
        return derived_hp;
    }

    public void setDerived_hp(Integer derived_hp) {
        this.derived_hp = derived_hp;
    }

    public Integer getDerived_humanity() {
        return derived_humanity;
    }

    public void setDerived_humanity(Integer derived_humanity) {
        this.derived_humanity = derived_humanity;
    }
}
