package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "skill_types")
public class SkillTypes {
    @Id
    private Long skill_type_id;
    private String skill_type_name;
    private String skill_type_desc;

    public Long getSkill_type_id() {
        return skill_type_id;
    }

    public void setSkill_type_id(Long skill_type_id) {
        this.skill_type_id = skill_type_id;
    }

    public String getSkill_type_name() {
        return skill_type_name;
    }

    public void setSkill_type_name(String skill_type_name) {
        this.skill_type_name = skill_type_name;
    }

    public String getSkill_type_desc() {
        return skill_type_desc;
    }

    public void setSkill_type_desc(String skill_type_desc) {
        this.skill_type_desc = skill_type_desc;
    }
}
