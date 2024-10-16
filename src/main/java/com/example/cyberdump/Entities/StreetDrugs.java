package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "street_drugs")
public class StreetDrugs {

    @Id
    private Long drug_id;
    private String drug_name;

}
