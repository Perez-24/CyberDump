package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CyberDB_toons_rbl_exec")
public class ToonsRoleBasedLifepathExec {
    @Id
    private Long toon_id;
    private String exec_type;
    private String division;
    private String good_bad;
    private String where_based;
    private String gunning4u_whois;
    private String boss_current_state;

    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public String getExec_type() {
        return exec_type;
    }

    public void setExec_type(String exec_type) {
        this.exec_type = exec_type;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getGood_bad() {
        return good_bad;
    }

    public void setGood_bad(String good_bad) {
        this.good_bad = good_bad;
    }

    public String getWhere_based() {
        return where_based;
    }

    public void setWhere_based(String where_based) {
        this.where_based = where_based;
    }

    public String getGunning4u_whois() {
        return gunning4u_whois;
    }

    public void setGunning4u_whois(String gunning4u_whois) {
        this.gunning4u_whois = gunning4u_whois;
    }

    public String getBoss_current_state() {
        return boss_current_state;
    }

    public void setBoss_current_state(String boss_current_state) {
        this.boss_current_state = boss_current_state;
    }
}
