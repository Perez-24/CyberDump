package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "statistics")
public class Statistics {
    @Id
    private Long statistic_id;
    private String statistic_name;
    private String statistic_abbv;

    private String statistic_group;

    private String statistic_desc;

    public Long getStatistic_id() {
        return statistic_id;
    }

    public void setStatistic_id(Long statistic_id) {
        this.statistic_id = statistic_id;
    }

    public String getStatistic_name() {
        return statistic_name;
    }

    public void setStatistic_name(String statistic_name) {
        this.statistic_name = statistic_name;
    }

    public String getStatistic_abbv() {
        return statistic_abbv;
    }

    public void setStatistic_abbv(String statistic_abbv) {
        this.statistic_abbv = statistic_abbv;
    }

    public String getStatistic_group() {
        return statistic_group;
    }

    public void setStatistic_group(String statistic_group) {
        this.statistic_group = statistic_group;
    }

    public String getStatistic_desc() {
        return statistic_desc;
    }

    public void setStatistic_desc(String statistic_desc) {
        this.statistic_desc = statistic_desc;
    }
}
