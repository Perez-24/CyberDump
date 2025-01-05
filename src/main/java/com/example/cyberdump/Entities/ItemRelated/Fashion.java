package com.example.cyberdump.Entities.ItemRelated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fashion")
public class Fashion {

    @Id
    private Long fashion_id;
    private String clothing_type;
    private String aesthetic_type;
    private String aesthetic_description;
    private String article_description;
    private String cost;

    public Long getFashion_id() {
        return fashion_id;
    }

    public void setFashion_id(Long fashion_id) {
        this.fashion_id = fashion_id;
    }

    public String getClothing_type() {
        return clothing_type;
    }

    public void setClothing_type(String clothing_type) {
        this.clothing_type = clothing_type;
    }

    public String getAesthetic_type() {
        return aesthetic_type;
    }

    public void setAesthetic_type(String aesthetic_type) {
        this.aesthetic_type = aesthetic_type;
    }

    public String getAesthetic_description() {
        return aesthetic_description;
    }

    public void setAesthetic_description(String aesthetic_description) {
        this.aesthetic_description = aesthetic_description;
    }

    public String getArticle_description() {
        return article_description;
    }

    public void setArticle_description(String article_description) {
        this.article_description = article_description;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
