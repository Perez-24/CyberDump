package com.example.cyberdump.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CyberDB_toons_lifepaths")
public class ToonsLifepath {

    @Id
    private Long toonId;

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    private String handle;
    private String cultural_origins;
    private String languages;
    private String personality;
    private String clothing_style;
    private String hairstyle;
    private String affectation;
    private String most_valued_quality;
    private String feelings_about_people;
    private String most_valued_person;
    private String most_valued_possession;
    private String original_background;
    private String original_background_desc;
    private String childhood_environment;
    private String family_crisis;
    private String friends_relationship_to_you;
    private String enemy;
    private String what_caused_it;
    private String what_can_enemy_do;
    private String sweet_revenge;
    private String what_happened;
    private String life_goals;

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getClothing_style() {
        return clothing_style;
    }

    public void setClothing_style(String clothing_style) {
        this.clothing_style = clothing_style;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    public String getAffectation() {
        return affectation;
    }

    public void setAffectation(String affectation) {
        this.affectation = affectation;
    }

    public String getMost_valued_quality() {
        return most_valued_quality;
    }

    public void setMost_valued_quality(String most_valued_quality) {
        this.most_valued_quality = most_valued_quality;
    }

    public String getFeelings_about_people() {
        return feelings_about_people;
    }

    public void setFeelings_about_people(String feelings_about_people) {
        this.feelings_about_people = feelings_about_people;
    }

    public String getMost_valued_person() {
        return most_valued_person;
    }

    public void setMost_valued_person(String most_valued_person) {
        this.most_valued_person = most_valued_person;
    }

    public String getMost_valued_possession() {
        return most_valued_possession;
    }

    public void setMost_valued_possession(String most_valued_possession) {
        this.most_valued_possession = most_valued_possession;
    }

    public String getOriginal_background() {
        return original_background;
    }

    public void setOriginal_background(String original_background) {
        this.original_background = original_background;
    }

    public String getOriginal_background_desc() {
        return original_background_desc;
    }

    public void setOriginal_background_desc(String original_background_desc) {
        this.original_background_desc = original_background_desc;
    }

    public String getChildhood_environment() {
        return childhood_environment;
    }

    public void setChildhood_environment(String childhood_environment) {
        this.childhood_environment = childhood_environment;
    }

    public String getFamily_crisis() {
        return family_crisis;
    }

    public void setFamily_crisis(String family_crisis) {
        this.family_crisis = family_crisis;
    }

    public String getFriends_relationship_to_you() {
        return friends_relationship_to_you;
    }

    public void setFriends_relationship_to_you(String friends_relationship_to_you) {
        this.friends_relationship_to_you = friends_relationship_to_you;
    }

    public String getEnemy() {
        return enemy;
    }

    public void setEnemy(String enemy) {
        this.enemy = enemy;
    }

    public String getWhat_caused_it() {
        return what_caused_it;
    }

    public void setWhat_caused_it(String what_caused_it) {
        this.what_caused_it = what_caused_it;
    }

    public String getWhat_can_enemy_do() {
        return what_can_enemy_do;
    }

    public void setWhat_can_enemy_do(String what_can_enemy_do) {
        this.what_can_enemy_do = what_can_enemy_do;
    }

    public String getSweet_revenge() {
        return sweet_revenge;
    }

    public void setSweet_revenge(String sweet_revenge) {
        this.sweet_revenge = sweet_revenge;
    }

    public String getWhat_happened() {
        return what_happened;
    }

    public void setWhat_happened(String what_happened) {
        this.what_happened = what_happened;
    }

    public String getLife_goals() {
        return life_goals;
    }

    public void setLife_goals(String life_goals) {
        this.life_goals = life_goals;
    }
    public Long getToonId() {
        return toonId;
    }
    public void setToonId(Long toonId) {
        this.toonId = toonId;
    }
    public String getCultural_origins() {
        return cultural_origins;
    }
    public void setCultural_origins(String cultural_origins) {
        this.cultural_origins = cultural_origins;
    }



}
