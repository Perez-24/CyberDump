package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CyberDB_toons_rbl_solo")
public class ToonsRoleBasedLifepathSolo {
    @Id
    private Long toon_id;
    private String what_kind_of_solo;
    private String moral_compass;
    private String operational_territory;
    private String who_gunning_4u;

    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public String getWhat_kind_of_solo() {
        return what_kind_of_solo;
    }

    public void setWhat_kind_of_solo(String what_kind_of_solo) {
        this.what_kind_of_solo = what_kind_of_solo;
    }

    public String getMoral_compass() {
        return moral_compass;
    }

    public void setMoral_compass(String moral_compass) {
        this.moral_compass = moral_compass;
    }

    public String getOperational_territory() {
        return operational_territory;
    }

    public void setOperational_territory(String operational_territory) {
        this.operational_territory = operational_territory;
    }

    public String getWho_gunning_4u() {
        return who_gunning_4u;
    }

    public void setWho_gunning_4u(String who_gunning_4u) {
        this.who_gunning_4u = who_gunning_4u;
    }
}
