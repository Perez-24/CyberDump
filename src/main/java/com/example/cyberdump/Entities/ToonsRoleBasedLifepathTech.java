package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CyberDB_toons_rbl_tech")
public class ToonsRoleBasedLifepathTech {
    @Id
    private Long toon_id;
    private String what_kind_of_tech;
            private String partner_whois;
    private String main_clients_whois;
            private String supplies_whereget;
    private String gunning4u_whois;

}
