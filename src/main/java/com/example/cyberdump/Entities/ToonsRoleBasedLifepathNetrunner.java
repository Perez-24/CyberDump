package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "toons_rbl_netrunner")
public class ToonsRoleBasedLifepathNetrunner {
    @Id
    private Long toon_id;
    private String what_kind_netrunner;
    private String workspace;
    private String partner_whois;
    private String main_clients_whois;
    private String programs_whereget;
    private String gunning4u_whois;

    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public String getWhat_kind_netrunner() {
        return what_kind_netrunner;
    }

    public void setWhat_kind_netrunner(String what_kind_netrunner) {
        this.what_kind_netrunner = what_kind_netrunner;
    }

    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public String getPartner_whois() {
        return partner_whois;
    }

    public void setPartner_whois(String partner_whois) {
        this.partner_whois = partner_whois;
    }

    public String getMain_clients_whois() {
        return main_clients_whois;
    }

    public void setMain_clients_whois(String main_clients_whois) {
        this.main_clients_whois = main_clients_whois;
    }

    public String getPrograms_whereget() {
        return programs_whereget;
    }

    public void setPrograms_whereget(String programs_whereget) {
        this.programs_whereget = programs_whereget;
    }

    public String getGunning4u_whois() {
        return gunning4u_whois;
    }

    public void setGunning4u_whois(String gunning4u_whois) {
        this.gunning4u_whois = gunning4u_whois;
    }
}
