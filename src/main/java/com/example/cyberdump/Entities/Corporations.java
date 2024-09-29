package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "corporations")
public class Corporations {
    @Id
    private Long corp_id;
    private String background;
    private String chief_designer;private String corp_name;
    private Integer employees;
    private String headquarters;

    public Long getCorp_id() {
        return corp_id;
    }

    public void setCorp_id(Long corp_id) {
        this.corp_id = corp_id;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getChief_designer() {
        return chief_designer;
    }

    public void setChief_designer(String chief_designer) {
        this.chief_designer = chief_designer;
    }

    public String getCorp_name() {
        return corp_name;
    }

    public void setCorp_name(String corp_name) {
        this.corp_name = corp_name;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }
}
