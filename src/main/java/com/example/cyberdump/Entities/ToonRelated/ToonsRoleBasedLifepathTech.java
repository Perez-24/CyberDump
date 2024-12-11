package com.example.cyberdump.Entities.ToonRelated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "toons_rbl_tech")
public class ToonsRoleBasedLifepathTech {
    @Id
    private Long toon_id;
    private String what_kind_of_tech;
            private String partner_whois;
    private String main_clients_whois;
            private String supplies_whereget;
    private String gunning4u_whois;

    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public String getWhat_kind_of_tech() {
        return what_kind_of_tech;
    }

    public void setWhat_kind_of_tech(String what_kind_of_tech) {
        this.what_kind_of_tech = what_kind_of_tech;
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

    public String getSupplies_whereget() {
        return supplies_whereget;
    }

    public void setSupplies_whereget(String supplies_whereget) {
        this.supplies_whereget = supplies_whereget;
    }

    public String getGunning4u_whois() {
        return gunning4u_whois;
    }

    public void setGunning4u_whois(String gunning4u_whois) {
        this.gunning4u_whois = gunning4u_whois;
    }
}
