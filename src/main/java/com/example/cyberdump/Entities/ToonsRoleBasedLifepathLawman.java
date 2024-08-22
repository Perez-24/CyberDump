package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CyberDB_toons_rbl_lawman")
public class ToonsRoleBasedLifepathLawman {
    @Id
    private Long toon_id;
    private String position;
    private String jurisdiction;
    private String how_corrupt;
    private String gunning4u_whois;
    private String major_target_whois;

    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getHow_corrupt() {
        return how_corrupt;
    }

    public void setHow_corrupt(String how_corrupt) {
        this.how_corrupt = how_corrupt;
    }

    public String getGunning4u_whois() {
        return gunning4u_whois;
    }

    public void setGunning4u_whois(String gunning4u_whois) {
        this.gunning4u_whois = gunning4u_whois;
    }

    public String getMajor_target_whois() {
        return major_target_whois;
    }

    public void setMajor_target_whois(String major_target_whois) {
        this.major_target_whois = major_target_whois;
    }
}
