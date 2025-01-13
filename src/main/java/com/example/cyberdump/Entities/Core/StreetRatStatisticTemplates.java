package com.example.cyberdump.Entities.Core;

import com.example.cyberdump.Entities.Core.CompositeKeys.StreetRatStatisticTemplateId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@IdClass(StreetRatStatisticTemplateId.class)
@Table(name = "statistic_templates")
public class StreetRatStatisticTemplates {
    @Id
    private Integer role_id;
    @Id
    private Integer stat_roll_id;
    private Integer inte;
    private Integer refl;
    private Integer dext;
    private Integer tech;
    private Integer cool;
    private Integer will;
    private Integer luck;
    private Integer move;
    private Integer body;
    private Integer empa;


    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getStat_roll_id() {
        return stat_roll_id;
    }

    public void setStat_roll_id(Integer stat_roll_id) {
        this.stat_roll_id = stat_roll_id;
    }

    public Integer getInte() {
        return inte;
    }

    public void setInte(Integer inte) {
        this.inte = inte;
    }

    public Integer getRefl() {
        return refl;
    }

    public void setRefl(Integer ref) {
        this.refl = ref;
    }

    public Integer getDext() {
        return dext;
    }

    public void setDext(Integer dex) {
        this.dext = dex;
    }

    public Integer getTech() {
        return tech;
    }

    public void setTech(Integer tech) {
        this.tech = tech;
    }

    public Integer getCool() {
        return cool;
    }

    public void setCool(Integer cool) {
        this.cool = cool;
    }

    public Integer getWill() {
        return will;
    }

    public void setWill(Integer will) {
        this.will = will;
    }

    public Integer getLuck() {
        return luck;
    }

    public void setLuck(Integer luck) {
        this.luck = luck;
    }

    public Integer getMove() {
        return move;
    }

    public void setMove(Integer move) {
        this.move = move;
    }

    public Integer getBody() {
        return body;
    }

    public void setBody(Integer body) {
        this.body = body;
    }

    public Integer getEmpa() {
        return empa;
    }

    public void setEmpa(Integer emp) {
        this.empa = emp;
    }
}
