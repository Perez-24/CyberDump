package com.example.cyberdump.Entities.Core.CompositeKeys;

import java.io.Serializable;

public class StreetRatStatisticTemplateId implements Serializable {
    private Integer role_id;
    private Integer stat_id;

    // default constructor

    public StreetRatStatisticTemplateId(Integer role_id, Integer stat_id) {
        this.role_id = role_id;
        this.stat_id = stat_id;
    }

    // equals() and hashCode()
}
