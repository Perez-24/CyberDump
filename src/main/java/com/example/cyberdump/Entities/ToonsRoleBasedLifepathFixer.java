package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CyberDB_toons_rbl_fixer")
public class ToonsRoleBasedLifepathFixer {
    @Id
    private Long toon_id;
    private String type_fixer;
    private String partner_whois;
    private String office_describe;
    private String side_clients_whois;
    private String gunning4u_whois;
}
