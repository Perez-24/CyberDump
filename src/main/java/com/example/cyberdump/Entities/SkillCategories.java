package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "skill_categories")
public class SkillCategories {
    @Id
    private Long skill_category_id;
    private String skill_category_name;
    private String skill_category_desc;

    public Long getSkill_category_id() {
        return skill_category_id;
    }

    public void setSkill_category_id(Long skill_type_id) {
        this.skill_category_id = skill_type_id;
    }

    public String getSkill_category_name() {
        return skill_category_name;
    }

    public void setSkill_category_name(String skill_type_name) {
        this.skill_category_name = skill_type_name;
    }

    public String getSkill_category_desc() {
        return skill_category_desc;
    }

    public void setSkill_category_desc(String skill_type_desc) {
        this.skill_category_desc = skill_type_desc;
    }
}
