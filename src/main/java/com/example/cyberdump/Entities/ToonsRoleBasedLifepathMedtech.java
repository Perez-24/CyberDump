package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CyberDB_toons_rbl_medtech")
public class ToonsRoleBasedLifepathMedtech {
    @Id
    private Long toon_id;
            private String medtech_whatkind;
    private String partner_whois;
    private String workspace;
    private String main_clients_whois;
    private String supplies_whereget;


}
