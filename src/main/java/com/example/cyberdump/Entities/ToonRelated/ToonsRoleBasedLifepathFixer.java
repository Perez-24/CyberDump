package com.example.cyberdump.Entities.ToonRelated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "toons_rbl_fixer")
public class ToonsRoleBasedLifepathFixer {
    @Id
    private Long toon_id;
    private String type_fixer;
    private String partner_whois;
    private String office_describe;
    private String side_clients_whois;
    private String gunning4u_whois;
    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public String getType_fixer() {
        return type_fixer;
    }

    public void setType_fixer(String type_fixer) {
        this.type_fixer = type_fixer;
    }

    public String getPartner_whois() {
        return partner_whois;
    }

    public void setPartner_whois(String partner_whois) {
        this.partner_whois = partner_whois;
    }

    public String getOffice_describe() {
        return office_describe;
    }

    public void setOffice_describe(String office_describe) {
        this.office_describe = office_describe;
    }

    public String getSide_clients_whois() {
        return side_clients_whois;
    }

    public void setSide_clients_whois(String side_clients_whois) {
        this.side_clients_whois = side_clients_whois;
    }

    public String getGunning4u_whois() {
        return gunning4u_whois;
    }

    public void setGunning4u_whois(String gunning4u_whois) {
        this.gunning4u_whois = gunning4u_whois;
    }
}
