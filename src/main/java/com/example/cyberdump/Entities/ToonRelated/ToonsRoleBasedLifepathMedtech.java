package com.example.cyberdump.Entities.ToonRelated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "toons_rbl_medtech")
public class ToonsRoleBasedLifepathMedtech {
    @Id
    private Long toon_id;
            private String medtech_whatkind;
    private String partner_whois;
    private String workspace;
    private String main_clients_whois;
    private String supplies_whereget;

    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public String getMedtech_whatkind() {
        return medtech_whatkind;
    }

    public void setMedtech_whatkind(String medtech_whatkind) {
        this.medtech_whatkind = medtech_whatkind;
    }

    public String getPartner_whois() {
        return partner_whois;
    }

    public void setPartner_whois(String partner_whois) {
        this.partner_whois = partner_whois;
    }

    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public String getMain_clients_whois() {
        return main_clients_whois;
    }

    public void setMain_clients_whois(String main_clients_whois) {
        this.main_clients_whois = main_clients_whois;
    }

    public String getSupplies_whereget() {
        return supplies_whereget;
    }

    public void setSupplies_whereget(String supplies_whereget) {
        this.supplies_whereget = supplies_whereget;
    }
}
