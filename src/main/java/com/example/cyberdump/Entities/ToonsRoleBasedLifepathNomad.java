package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CyberDB_toons_rbl_nomad")
public class ToonsRoleBasedLifepathNomad {
    @Id
    private Long toon_id;
    private String pack_size;
    private Integer pack_type;
    private String  job_for_pack;
    private String pack_philosophy;
    private String  gunning4u_pack_whois;
}
