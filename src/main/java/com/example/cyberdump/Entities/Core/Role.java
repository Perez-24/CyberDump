package com.example.cyberdump.Entities.Core;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    private Integer role_id;
    private String role_name;
    private String role_desc;
    private String role_ability;
    private String role_rules;

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_desc() {
        return role_desc;
    }

    public void setRole_desc(String role_desc) {
        this.role_desc = role_desc;
    }

    public String getRole_ability() {
        return role_ability;
    }

    public void setRole_ability(String role_ability) {
        this.role_ability = role_ability;
    }

    public String getRole_rules() {
        return role_rules;
    }

    public void setRole_rules(String role_rules) {
        this.role_rules = role_rules;
    }


}
