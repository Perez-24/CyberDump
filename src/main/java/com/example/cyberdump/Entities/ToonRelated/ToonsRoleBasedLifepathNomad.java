package com.example.cyberdump.Entities.ToonRelated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "toons_rbl_nomad")
public class ToonsRoleBasedLifepathNomad {
    @Id
    private Long toon_id;
    private String pack_size;
    private Integer pack_type;
    private String  job_for_pack;
    private String pack_philosophy;
    private String  gunning4u_pack_whois;

    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public String getPack_size() {
        return pack_size;
    }

    public void setPack_size(String pack_size) {
        this.pack_size = pack_size;
    }

    public Integer getPack_type() {
        return pack_type;
    }

    public void setPack_type(Integer pack_type) {
        this.pack_type = pack_type;
    }

    public String getJob_for_pack() {
        return job_for_pack;
    }

    public void setJob_for_pack(String job_for_pack) {
        this.job_for_pack = job_for_pack;
    }

    public String getPack_philosophy() {
        return pack_philosophy;
    }

    public void setPack_philosophy(String pack_philosophy) {
        this.pack_philosophy = pack_philosophy;
    }

    public String getGunning4u_pack_whois() {
        return gunning4u_pack_whois;
    }

    public void setGunning4u_pack_whois(String gunning4u_pack_whois) {
        this.gunning4u_pack_whois = gunning4u_pack_whois;
    }
}
