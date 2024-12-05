package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "skills")
public class Skills {
    @Id
    private Long skill_id;
    private String skill_name;
    private String skill_desc;

    private Integer skill_type;
    private Integer is_hard;

    public Long getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(Long skill_id) {
        this.skill_id = skill_id;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public String getSkill_desc() {
        return skill_desc;
    }

    public void setSkill_desc(String skill_desc) {
        this.skill_desc = skill_desc;
    }

    public Integer getSkill_type() {
        return skill_type;
    }

    public void setSkill_type(Integer skill_type) {
        this.skill_type = skill_type;
    }

    public Integer getIs_hard() {
        return is_hard;
    }

    public void setIs_hard(Integer is_hard) {
        this.is_hard = is_hard;
    }
}
