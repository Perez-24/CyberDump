package com.example.cyberdump.Entities.Core;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "skills")
public class Skills {
    @Id
    private Long skill_id;
    private String skill_name;
    private String skill_name_toon_link;
    private String skill_desc;
    private Integer skill_affiliated_statistic_id;
    private Integer skill_category_id;
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


    public Integer getIs_hard() {
        return is_hard;
    }

    public void setIs_hard(Integer is_hard) {
        this.is_hard = is_hard;
    }

    public Integer getSkill_affiliated_statistic_id() {
        return skill_affiliated_statistic_id;
    }

    public void setSkill_affiliated_statistic_id(Integer skill_statistic) {
        this.skill_affiliated_statistic_id = skill_statistic;
    }

    public Integer getSkill_category_id() {
        return skill_category_id;
    }

    public void setSkill_category_id(Integer skill_category) {
        this.skill_category_id = skill_category;
    }

    public String getSkill_name_toon_link() {
        return skill_name_toon_link;
    }

    public void setSkill_name_toon_link(String skill_name_toon_link) {
        this.skill_name_toon_link = skill_name_toon_link;
    }
}
