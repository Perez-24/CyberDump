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
    private String where_did_you_perform;
    private String are_you_group_or_solo;
    private String were_you_once_in_a_group;
    private String why_did_you_leave;

    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public String getRockerboy_type() {
        return rockerboy_type;
    }

    public void setRockerboy_type(String rockerboy_type) {
        this.rockerboy_type = rockerboy_type;
    }

    public Integer getWhere_did_you_perform() {
        return where_did_you_perform;
    }

    public void setWhere_did_you_perform(Integer where_did_you_perform) {
        this.where_did_you_perform = where_did_you_perform;
    }

    public Integer getAre_you_group_or_solo() {
        return are_you_group_or_solo;
    }

    public void setAre_you_group_or_solo(Integer are_you_group_or_solo) {
        this.are_you_group_or_solo = are_you_group_or_solo;
    }

    public Integer getWere_you_once_in_a_group() {
        return were_you_once_in_a_group;
    }

    public void setWere_you_once_in_a_group(Integer were_you_once_in_a_group) {
        this.were_you_once_in_a_group = were_you_once_in_a_group;
    }

    public Integer getWhy_did_you_leave() {
        return why_did_you_leave;
    }

    public void setWhy_did_you_leave(Integer why_did_you_leave) {
        this.why_did_you_leave = why_did_you_leave;
    }
}
