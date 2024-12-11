package com.example.cyberdump.Entities.GeneralGearRelated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "range_wpns")
public class RangedWeapons {
    @Id
    private Long wpn_id;
    private String wpn_name;
    private String wpn_type;
    private Integer num_hands;
    private String damage;
    private Integer rof;
    private Boolean can_be_concealed;
    private Integer cost;
    private String wpn_skill;
    private Integer wpn_skill_id;
    private Integer magazine;
    private Integer autofire;
    private Boolean can_suppressive_fire;
    private Boolean uses_shotgun_shells;
    private Boolean uses_arrows;
    private Boolean is_explosive;


    public Long getWpn_id() {
        return wpn_id;
    }

    public void setWpn_id(Long wpn_id) {
        this.wpn_id = wpn_id;
    }

    public String getWpn_name() {
        return wpn_name;
    }

    public void setWpn_name(String wpn_name) {
        this.wpn_name = wpn_name;
    }

    public String getWpn_type() {
        return wpn_type;
    }

    public void setWpn_type(String wpn_type) {
        this.wpn_type = wpn_type;
    }

    public Integer getNum_hands() {
        return num_hands;
    }

    public void setNum_hands(Integer num_hands) {
        this.num_hands = num_hands;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public Integer getRof() {
        return rof;
    }

    public void setRof(Integer ROF) {
        this.rof = ROF;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getWpn_skill() {
        return wpn_skill;
    }

    public void setWpn_skill(String wpn_skill) {
        this.wpn_skill = wpn_skill;
    }

    public Integer getMagazine() {
        return magazine;
    }

    public void setMagazine(Integer magazine) {
        this.magazine = magazine;
    }

    public Boolean getCan_be_concealed() {
        return can_be_concealed;
    }

    public void setCan_be_concealed(Boolean can_be_concealed) {
        this.can_be_concealed = can_be_concealed;
    }

    public Integer getAutofire() {
        return autofire;
    }

    public void setAutofire(Integer canAutofire) {
        this.autofire = canAutofire;
    }

    public Boolean getCan_suppressive_fire() {
        return can_suppressive_fire;
    }

    public void setCan_suppressive_fire(Boolean canSuppressiveFire) {
        this.can_suppressive_fire = canSuppressiveFire;
    }

    public Boolean getUses_shotgun_shells() {
        return uses_shotgun_shells;
    }

    public void setUses_shotgun_shells(Boolean usesShotgunShells) {
        this.uses_shotgun_shells = usesShotgunShells;
    }

    public Boolean getUses_arrows() {
        return uses_arrows;
    }

    public void setUses_arrows(Boolean usesArrows) {
        this.uses_arrows = usesArrows;
    }

    public Boolean getIs_explosive() {
        return is_explosive;
    }

    public void setIs_explosive(Boolean is_explosive) {
        this.is_explosive = is_explosive;
    }

    public Integer getWpn_skill_id() {
        return wpn_skill_id;
    }

    public void setWpn_skill_id(Integer wpn_skill_id) {
        this.wpn_skill_id = wpn_skill_id;
    }
}
