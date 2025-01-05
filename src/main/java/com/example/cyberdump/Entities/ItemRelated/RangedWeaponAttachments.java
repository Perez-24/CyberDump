package com.example.cyberdump.Entities.ItemRelated;

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

    public Integer getAttachment_id() {
        return attachment_id;
    }

    public void setAttachment_id(Integer attachment_id) {
        this.attachment_id = attachment_id;
    }

    public Integer getWpn_id() {
        return wpn_id;
    }

    public void setWpn_id(Integer wpn_id) {
        this.wpn_id = wpn_id;
    }

    public String getAttachment_name() {
        return attachment_name;
    }

    public void setAttachment_name(String attachment_name) {
        this.attachment_name = attachment_name;
    }

    public Integer getAttachment_cost() {
        return attachment_cost;
    }

    public void setAttachment_cost(Integer attachment_cost) {
        this.attachment_cost = attachment_cost;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getEligible_weapons() {
        return eligible_weapons;
    }

    public void setEligible_weapons(String eligible_weapons) {
        this.eligible_weapons = eligible_weapons;
    }
}
