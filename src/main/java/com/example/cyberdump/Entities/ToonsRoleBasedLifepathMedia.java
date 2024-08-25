package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CyberDB_toons_rbl_media")
public class ToonsRoleBasedLifepathMedia {
    @Id
    private Long toon_id;
    private String media_type;
    private Integer work_how;
    private String ethics;
    private String stories_type_you_tell;

    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public Integer getWork_how() {
        return work_how;
    }

    public void setWork_how(Integer work_how) {
        this.work_how = work_how;
    }

    public String getEthics() {
        return ethics;
    }

    public void setEthics(String ethics) {
        this.ethics = ethics;
    }

    public String getStories_type_you_tell() {
        return stories_type_you_tell;
    }

    public void setStories_type_you_tell(String stories_type_you_tell) {
        this.stories_type_you_tell = stories_type_you_tell;
    }
}
