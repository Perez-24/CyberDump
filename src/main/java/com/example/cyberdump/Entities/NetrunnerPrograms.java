package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "programs")
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

    public String getProgramClass() {
        return programClass;
    }

    public void setProgramClass(String programClass) {
        this.programClass = programClass;
    }

    public Integer getATK() {
        return ATK;
    }

    public void setATK(Integer ATK) {
        this.ATK = ATK;
    }

    public Integer getDEF() {
        return DEF;
    }

    public void setDEF(Integer DEF) {
        this.DEF = DEF;
    }

    public Integer getREZ() {
        return REZ;
    }

    public void setREZ(Integer REZ) {
        this.REZ = REZ;
    }

    public String getEffect() {
        return Effect;
    }

    public void setEffect(String effect) {
        Effect = effect;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
