package com.example.cyberdump.Entities.ItemRelated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cyberware")
public class Cyberware {

    @Id
    private Long cyberware_id;
    private String cyberware_name;
    private String cyberware_type;
    private String cyberware_type_id;
    private String install_type;
    private String description;
    private String cost;
    private String hl_avg;
    private String hl;
    private Boolean is_foundational;
    private Integer required_cyberware;
    private Integer requires_pair;
    private Integer available_option_slots;
    private Integer option_slot_cost;





    public Long getCyberware_id() {
        return cyberware_id;
    }

    public void setCyberware_id(Long cyberware_id) {
        this.cyberware_id = cyberware_id;
    }

    public String getCyberware_name() {
        return cyberware_name;
    }

    public void setCyberware_name(String cyberware_name) {
        this.cyberware_name = cyberware_name;
    }

    public String getCyberware_type() {
        return cyberware_type;
    }

    public void setCyberware_type(String cyberware_type) {
        this.cyberware_type = cyberware_type;
    }

    public String getInstall_type() {
        return install_type;
    }

    public void setInstall_type(String install_type) {
        this.install_type = install_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getHl_avg() {
        return hl_avg;
    }

    public void setHl_avg(String hl_avg) {
        this.hl_avg = hl_avg;
    }

    public String getHl() {
        return hl;
    }

    public void setHl(String hl) {
        this.hl = hl;
    }

    public String getCyberware_type_id() {
        return cyberware_type_id;
    }

    public void setCyberware_type_id(String cyberware_type_id) {
        this.cyberware_type_id = cyberware_type_id;
    }

    public Boolean getIs_foundational() {
        return is_foundational;
    }

    public void setIs_foundational(Boolean is_foundational) {
        this.is_foundational = is_foundational;
    }

    public Integer getRequired_cyberware() {
        return required_cyberware;
    }

    public void setRequired_cyberware(Integer required_cyberware) {
        this.required_cyberware = required_cyberware;
    }

    public Integer getRequires_pair() {
        return requires_pair;
    }

    public void setRequires_pair(Integer requires_pair) {
        this.requires_pair = requires_pair;
    }

    public Integer getAvailable_option_slots() {
        return available_option_slots;
    }

    public void setAvailable_option_slots(Integer available_option_slots) {
        this.available_option_slots = available_option_slots;
    }

    public Integer getOption_slot_cost() {
        return option_slot_cost;
    }

    public void setOption_slot_cost(Integer option_slot_cost) {
        this.option_slot_cost = option_slot_cost;
    }
}
