package com.example.cyberdump.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "street_drugs")
public class StreetDrugs {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)

    private Long drug_id;
    private String drug_name;
    private Integer duration_hours;
    private Integer secondary_effect_dv;
    private Integer cost_per_dose;
    private String primary_effect_1;
    private String primary_effect_2;
    private String primary_effect_3;
    private String secondary_effect_1;
    private String secondary_effect_2;
    private String secondary_effect3;

    public Long getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(Long drug_id) {
        this.drug_id = drug_id;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public Integer getDuration_hours() {
        return duration_hours;
    }

    public void setDuration_hours(Integer duration_hours) {
        this.duration_hours = duration_hours;
    }

    public Integer getSecondary_effect_dv() {
        return secondary_effect_dv;
    }

    public void setSecondary_effect_dv(Integer secondary_effect_dv) {
        this.secondary_effect_dv = secondary_effect_dv;
    }

    public Integer getCost_per_dose() {
        return cost_per_dose;
    }

    public void setCost_per_dose(Integer cost_per_dose) {
        this.cost_per_dose = cost_per_dose;
    }

    public String getPrimary_effect_1() {
        return primary_effect_1;
    }

    public void setPrimary_effect_1(String primary_effect_1) {
        this.primary_effect_1 = primary_effect_1;
    }

    public String getPrimary_effect_2() {
        return primary_effect_2;
    }

    public void setPrimary_effect_2(String primary_effect_2) {
        this.primary_effect_2 = primary_effect_2;
    }

    public String getPrimary_effect_3() {
        return primary_effect_3;
    }

    public void setPrimary_effect_3(String primary_effect_3) {
        this.primary_effect_3 = primary_effect_3;
    }

    public String getSecondary_effect_1() {
        return secondary_effect_1;
    }

    public void setSecondary_effect_1(String secondary_effect_1) {
        this.secondary_effect_1 = secondary_effect_1;
    }

    public String getSecondary_effect_2() {
        return secondary_effect_2;
    }

    public void setSecondary_effect_2(String secondary_effect_2) {
        this.secondary_effect_2 = secondary_effect_2;
    }

    public String getSecondary_effect3() {
        return secondary_effect3;
    }

    public void setSecondary_effect3(String secondary_effect3) {
        this.secondary_effect3 = secondary_effect3;
    }
}
