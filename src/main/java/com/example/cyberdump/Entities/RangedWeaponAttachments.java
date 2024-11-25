package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "range_wpns_attachments")
public class RangedWeaponAttachments {

    @Id
    private Integer attachment_id;
    private Integer wpn_id;
    private String attachment_name;
    private Integer attachment_cost;
    private String effect;
    private String eligible_weapons;

}
