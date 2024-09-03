package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CyberDB_toons_rbl_rockerboy")
public class ToonsRoleBasedLifepathRockerboy {
    @Id
    private Long toon_id;
    private String rockerboy_type;
    private Integer where_did_you_perform;
    private Integer are_you_group_or_solo;
    private Integer were_you_once_in_a_group;
    private Integer why_did_you_leave;
}
