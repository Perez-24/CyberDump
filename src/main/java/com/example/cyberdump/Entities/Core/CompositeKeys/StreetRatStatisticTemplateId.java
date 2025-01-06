package com.example.cyberdump.Entities.Core.CompositeKeys;

import java.io.Serializable;

public class StreetRatStatisticTemplateId implements Serializable {
    private Integer role_id;
    private Integer stat_roll_id;

    // default constructor

    public StreetRatStatisticTemplateId(Integer role_id, Integer stat_roll_id) {
        this.role_id = role_id;
        this.stat_roll_id = stat_roll_id;
    }

    // equals() and hashCode()
}
