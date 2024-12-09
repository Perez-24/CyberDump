package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "map_toon_to_skill")
public class MapToonToSkill {

    @Id
    private Long skill_id;
    private String skill_name_ugly;

    public Long getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(Long skill_id) {
        this.skill_id = skill_id;
    }

    public String getSkill_name_ugly() {
        return skill_name_ugly;
    }

    public void setSkill_name_ugly(String skill_name_ugly) {
        this.skill_name_ugly = skill_name_ugly;
    }
}
