package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CyberDB_toons_rbl_tech")
public class Corporations {
    @Id
    private Long corp_id;
    private String background;
    private String chief_designer;private String corp_name;
    private Integer employees;
    private String headquarters;

}
