package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cyberware")
public class NetrunnerPrograms {

    @Id
    private Long program_id;
    private String programName;
    private String programClass;
    private Integer ATK;
    private Integer DEF;
    private Integer REZ;
    private String Effect;
    private Integer cost;

    public Long getProgram_id() {
        return program_id;
    }

    public void setProgram_id(Long program_id) {
        this.program_id = program_id;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
