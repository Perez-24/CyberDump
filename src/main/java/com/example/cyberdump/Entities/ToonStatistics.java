package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "toon_statistics")
public class ToonStatistics {

    @Id
    private Long toon_id;

    private Integer int_score;
    private Integer will_score;
    private Integer cool_score;
    private Integer emp_score;
    private Integer tech_score;
    private Integer ref_score;
    private Integer luck_score;
    private Integer body_score;
    private Integer dex_score;
    private Integer move_score;

    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public Integer getInt_score() {
        return int_score;
    }

    public void setInt_score(Integer int_score) {
        this.int_score = int_score;
    }

    public Integer getWill_score() {
        return will_score;
    }

    public void setWill_score(Integer will_score) {
        this.will_score = will_score;
    }

    public Integer getCool_score() {
        return cool_score;
    }

    public void setCool_score(Integer cool_score) {
        this.cool_score = cool_score;
    }

    public Integer getEmp_score() {
        return emp_score;
    }

    public void setEmp_score(Integer emp_score) {
        this.emp_score = emp_score;
    }

    public Integer getTech_score() {
        return tech_score;
    }

    public void setTech_score(Integer tech_score) {
        this.tech_score = tech_score;
    }

    public Integer getRef_score() {
        return ref_score;
    }

    public void setRef_score(Integer ref_score) {
        this.ref_score = ref_score;
    }

    public Integer getLuck_score() {
        return luck_score;
    }

    public void setLuck_score(Integer luck_score) {
        this.luck_score = luck_score;
    }

    public Integer getBody_score() {
        return body_score;
    }

    public void setBody_score(Integer body_score) {
        this.body_score = body_score;
    }

    public Integer getDex_score() {
        return dex_score;
    }

    public void setDex_score(Integer dex_score) {
        this.dex_score = dex_score;
    }

    public Integer getMove_score() {
        return move_score;
    }

    public void setMove_score(Integer move_score) {
        this.move_score = move_score;
    }
}
