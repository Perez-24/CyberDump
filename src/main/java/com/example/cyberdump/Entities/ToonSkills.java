package com.example.cyberdump.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "toon_skills")
public class ToonSkills {

    @Id
    private Long toon_id;
    private Integer concentration_score;
    private Integer conceal_reveal_object_score;
    private Integer lip_reading_score;
    private Integer perception_score;
    private Integer tracking_score;
    private Integer athletics_score;
    private Integer contortionist_score;
    private Integer dance_score;
    private Integer endurance_score;
    private Integer resist_torture_drugs_score;
    private Integer stealth_score;
    private Integer drive_land_vehicle_score;
    private Integer pilot_air_vehicle_score;
    private Integer pilot_sea_vehicle_score;
    private Integer riding_score;
    private Integer accounting_score;
    private Integer animal_handling_score;
    private Integer bureaucracy_score;
    private Integer business_score;
    private Integer composition_score;
    private Integer criminology_score;
    private Integer cryptography_score;
    private Integer deduction_score;
    private Integer education_score;
    private Integer gamble_score;
    private Integer language_score;
    private Integer library_search_score;
    private Integer local_expert_score;
    private Integer science_score;
    private Integer tactics_score;
    private Integer wilderness_survival_score;
    private Integer brawling_score;
    private Integer evasion_score;
    private Integer martial_arts_score;
    private Integer melee_weapon_score;
    private Integer acting_score;
    private Integer play_instrument_score;
    private Integer archery_score;
    private Integer autofire_score;
    private Integer handgun_score;
    private Integer heavy_weapons_score;
    private Integer shoulder_arms_score;
    private Integer bribery_score;
    private Integer conversation_score;
    private Integer human_perception_score;
    private Integer interrogation_score;
    private Integer persuasion_score;
    private Integer personal_grooming_score;
    private Integer streetwise_score;
    private Integer trading_score;
    private Integer wardrobe_and_style_score;
    private Integer air_vehicle_tech_score;
    private Integer basic_tech_score;
    private Integer cybertech_score;
    private Integer demolitions_score;
    private Integer electronics_security_tech_score;
    private Integer first_aid_score;
    private Integer forgery_score;
    private Integer land_vehicle_tech_score;
    private Integer point_draw_sculpt_score;
    private Integer paramedic_score;
    private Integer photography_film_score;
    private Integer pick_lock_score;
    private Integer pick_pocket_score;
    private Integer sea_vehicle_tech;
    private Integer weaponstech_score;

    public Long getToon_id() {
        return toon_id;
    }

    public void setToon_id(Long toon_id) {
        this.toon_id = toon_id;
    }

    public Integer getConcentration_score() {
        return concentration_score;
    }

    public void setConcentration_score(Integer concentration_score) {
        this.concentration_score = concentration_score;
    }

    public Integer getConceal_reveal_object_score() {
        return conceal_reveal_object_score;
    }

    public void setConceal_reveal_object_score(Integer conceal_reveal_object_score) {
        this.conceal_reveal_object_score = conceal_reveal_object_score;
    }

    public Integer getLip_reading_score() {
        return lip_reading_score;
    }

    public void setLip_reading_score(Integer lip_reading_score) {
        this.lip_reading_score = lip_reading_score;
    }

    public Integer getPerception_score() {
        return perception_score;
    }

    public void setPerception_score(Integer perception_score) {
        this.perception_score = perception_score;
    }

    public Integer getTracking_score() {
        return tracking_score;
    }

    public void setTracking_score(Integer tracking_score) {
        this.tracking_score = tracking_score;
    }

    public Integer getAthletics_score() {
        return athletics_score;
    }

    public void setAthletics_score(Integer athletics_score) {
        this.athletics_score = athletics_score;
    }

    public Integer getContortionist_score() {
        return contortionist_score;
    }

    public void setContortionist_score(Integer contortionist_score) {
        this.contortionist_score = contortionist_score;
    }

    public Integer getDance_score() {
        return dance_score;
    }

    public void setDance_score(Integer dance_score) {
        this.dance_score = dance_score;
    }

    public Integer getEndurance_score() {
        return endurance_score;
    }

    public void setEndurance_score(Integer endurance_score) {
        this.endurance_score = endurance_score;
    }

    public Integer getResist_torture_drugs_score() {
        return resist_torture_drugs_score;
    }

    public void setResist_torture_drugs_score(Integer resist_torture_drugs_score) {
        this.resist_torture_drugs_score = resist_torture_drugs_score;
    }

    public Integer getStealth_score() {
        return stealth_score;
    }

    public void setStealth_score(Integer stealth_score) {
        this.stealth_score = stealth_score;
    }

    public Integer getDrive_land_vehicle_score() {
        return drive_land_vehicle_score;
    }

    public void setDrive_land_vehicle_score(Integer drive_land_vehicle_score) {
        this.drive_land_vehicle_score = drive_land_vehicle_score;
    }

    public Integer getPilot_air_vehicle_score() {
        return pilot_air_vehicle_score;
    }

    public void setPilot_air_vehicle_score(Integer pilot_air_vehicle_score) {
        this.pilot_air_vehicle_score = pilot_air_vehicle_score;
    }

    public Integer getPilot_sea_vehicle_score() {
        return pilot_sea_vehicle_score;
    }

    public void setPilot_sea_vehicle_score(Integer pilot_sea_vehicle_score) {
        this.pilot_sea_vehicle_score = pilot_sea_vehicle_score;
    }

    public Integer getRiding_score() {
        return riding_score;
    }

    public void setRiding_score(Integer riding_score) {
        this.riding_score = riding_score;
    }

    public Integer getAccounting_score() {
        return accounting_score;
    }

    public void setAccounting_score(Integer accounting_score) {
        this.accounting_score = accounting_score;
    }

    public Integer getAnimal_handling_score() {
        return animal_handling_score;
    }

    public void setAnimal_handling_score(Integer animal_handling_score) {
        this.animal_handling_score = animal_handling_score;
    }

    public Integer getBureaucracy_score() {
        return bureaucracy_score;
    }

    public void setBureaucracy_score(Integer bureaucracy_score) {
        this.bureaucracy_score = bureaucracy_score;
    }

    public Integer getBusiness_score() {
        return business_score;
    }

    public void setBusiness_score(Integer business_score) {
        this.business_score = business_score;
    }

    public Integer getComposition_score() {
        return composition_score;
    }

    public void setComposition_score(Integer composition_score) {
        this.composition_score = composition_score;
    }

    public Integer getCriminology_score() {
        return criminology_score;
    }

    public void setCriminology_score(Integer criminology_score) {
        this.criminology_score = criminology_score;
    }

    public Integer getCryptography_score() {
        return cryptography_score;
    }

    public void setCryptography_score(Integer cryptography_score) {
        this.cryptography_score = cryptography_score;
    }

    public Integer getDeduction_score() {
        return deduction_score;
    }

    public void setDeduction_score(Integer deduction_score) {
        this.deduction_score = deduction_score;
    }

    public Integer getEducation_score() {
        return education_score;
    }

    public void setEducation_score(Integer education_score) {
        this.education_score = education_score;
    }

    public Integer getGamble_score() {
        return gamble_score;
    }

    public void setGamble_score(Integer gamble_score) {
        this.gamble_score = gamble_score;
    }

    public Integer getLanguage_score() {
        return language_score;
    }

    public void setLanguage_score(Integer language_score) {
        this.language_score = language_score;
    }

    public Integer getLibrary_search_score() {
        return library_search_score;
    }

    public void setLibrary_search_score(Integer library_search_score) {
        this.library_search_score = library_search_score;
    }

    public Integer getLocal_expert_score() {
        return local_expert_score;
    }

    public void setLocal_expert_score(Integer local_expert_score) {
        this.local_expert_score = local_expert_score;
    }

    public Integer getScience_score() {
        return science_score;
    }

    public void setScience_score(Integer science_score) {
        this.science_score = science_score;
    }

    public Integer getTactics_score() {
        return tactics_score;
    }

    public void setTactics_score(Integer tactics_score) {
        this.tactics_score = tactics_score;
    }

    public Integer getWilderness_survival_score() {
        return wilderness_survival_score;
    }

    public void setWilderness_survival_score(Integer wilderness_survival_score) {
        this.wilderness_survival_score = wilderness_survival_score;
    }

    public Integer getBrawling_score() {
        return brawling_score;
    }

    public void setBrawling_score(Integer brawling_score) {
        this.brawling_score = brawling_score;
    }

    public Integer getEvasion_score() {
        return evasion_score;
    }

    public void setEvasion_score(Integer evasion_score) {
        this.evasion_score = evasion_score;
    }

    public Integer getMartial_arts_score() {
        return martial_arts_score;
    }

    public void setMartial_arts_score(Integer martial_arts_score) {
        this.martial_arts_score = martial_arts_score;
    }

    public Integer getMelee_weapon_score() {
        return melee_weapon_score;
    }

    public void setMelee_weapon_score(Integer melee_weapon_score) {
        this.melee_weapon_score = melee_weapon_score;
    }

    public Integer getActing_score() {
        return acting_score;
    }

    public void setActing_score(Integer acting_score) {
        this.acting_score = acting_score;
    }

    public Integer getPlay_instrument_score() {
        return play_instrument_score;
    }

    public void setPlay_instrument_score(Integer play_instrument_score) {
        this.play_instrument_score = play_instrument_score;
    }

    public Integer getArchery_score() {
        return archery_score;
    }

    public void setArchery_score(Integer archery_score) {
        this.archery_score = archery_score;
    }

    public Integer getAutofire_score() {
        return autofire_score;
    }

    public void setAutofire_score(Integer autofire_score) {
        this.autofire_score = autofire_score;
    }

    public Integer getHandgun_score() {
        return handgun_score;
    }

    public void setHandgun_score(Integer handgun_score) {
        this.handgun_score = handgun_score;
    }

    public Integer getHeavy_weapons_score() {
        return heavy_weapons_score;
    }

    public void setHeavy_weapons_score(Integer heavy_weapons_score) {
        this.heavy_weapons_score = heavy_weapons_score;
    }

    public Integer getShoulder_arms_score() {
        return shoulder_arms_score;
    }

    public void setShoulder_arms_score(Integer shoulder_arms_score) {
        this.shoulder_arms_score = shoulder_arms_score;
    }

    public Integer getBribery_score() {
        return bribery_score;
    }

    public void setBribery_score(Integer bribery_score) {
        this.bribery_score = bribery_score;
    }

    public Integer getConversation_score() {
        return conversation_score;
    }

    public void setConversation_score(Integer conversation_score) {
        this.conversation_score = conversation_score;
    }

    public Integer getHuman_perception_score() {
        return human_perception_score;
    }

    public void setHuman_perception_score(Integer human_perception_score) {
        this.human_perception_score = human_perception_score;
    }

    public Integer getInterrogation_score() {
        return interrogation_score;
    }

    public void setInterrogation_score(Integer interrogation_score) {
        this.interrogation_score = interrogation_score;
    }

    public Integer getPersuasion_score() {
        return persuasion_score;
    }

    public void setPersuasion_score(Integer persuasion_score) {
        this.persuasion_score = persuasion_score;
    }

    public Integer getPersonal_grooming_score() {
        return personal_grooming_score;
    }

    public void setPersonal_grooming_score(Integer personal_grooming_score) {
        this.personal_grooming_score = personal_grooming_score;
    }

    public Integer getStreetwise_score() {
        return streetwise_score;
    }

    public void setStreetwise_score(Integer streetwise_score) {
        this.streetwise_score = streetwise_score;
    }

    public Integer getTrading_score() {
        return trading_score;
    }

    public void setTrading_score(Integer trading_score) {
        this.trading_score = trading_score;
    }

    public Integer getWardrobe_and_style_score() {
        return wardrobe_and_style_score;
    }

    public void setWardrobe_and_style_score(Integer wardrobe_and_style_score) {
        this.wardrobe_and_style_score = wardrobe_and_style_score;
    }

    public Integer getAir_vehicle_tech_score() {
        return air_vehicle_tech_score;
    }

    public void setAir_vehicle_tech_score(Integer air_vehicle_tech_score) {
        this.air_vehicle_tech_score = air_vehicle_tech_score;
    }

    public Integer getBasic_tech_score() {
        return basic_tech_score;
    }

    public void setBasic_tech_score(Integer basic_tech_score) {
        this.basic_tech_score = basic_tech_score;
    }

    public Integer getCybertech_score() {
        return cybertech_score;
    }

    public void setCybertech_score(Integer cybertech_score) {
        this.cybertech_score = cybertech_score;
    }

    public Integer getDemolitions_score() {
        return demolitions_score;
    }

    public void setDemolitions_score(Integer demolitions_score) {
        this.demolitions_score = demolitions_score;
    }

    public Integer getElectronics_security_tech_score() {
        return electronics_security_tech_score;
    }

    public void setElectronics_security_tech_score(Integer electronics_security_tech_score) {
        this.electronics_security_tech_score = electronics_security_tech_score;
    }

    public Integer getFirst_aid_score() {
        return first_aid_score;
    }

    public void setFirst_aid_score(Integer first_aid_score) {
        this.first_aid_score = first_aid_score;
    }

    public Integer getForgery_score() {
        return forgery_score;
    }

    public void setForgery_score(Integer forgery_score) {
        this.forgery_score = forgery_score;
    }

    public Integer getLand_vehicle_tech_score() {
        return land_vehicle_tech_score;
    }

    public void setLand_vehicle_tech_score(Integer land_vehicle_tech_score) {
        this.land_vehicle_tech_score = land_vehicle_tech_score;
    }

    public Integer getPoint_draw_sculpt_score() {
        return point_draw_sculpt_score;
    }

    public void setPoint_draw_sculpt_score(Integer point_draw_sculpt_score) {
        this.point_draw_sculpt_score = point_draw_sculpt_score;
    }

    public Integer getParamedic_score() {
        return paramedic_score;
    }

    public void setParamedic_score(Integer paramedic_score) {
        this.paramedic_score = paramedic_score;
    }

    public Integer getPhotography_film_score() {
        return photography_film_score;
    }

    public void setPhotography_film_score(Integer photography_film_score) {
        this.photography_film_score = photography_film_score;
    }

    public Integer getPick_lock_score() {
        return pick_lock_score;
    }

    public void setPick_lock_score(Integer pick_lock_score) {
        this.pick_lock_score = pick_lock_score;
    }

    public Integer getPick_pocket_score() {
        return pick_pocket_score;
    }

    public void setPick_pocket_score(Integer pick_pocket_score) {
        this.pick_pocket_score = pick_pocket_score;
    }

    public Integer getSea_vehicle_tech() {
        return sea_vehicle_tech;
    }

    public void setSea_vehicle_tech(Integer sea_vehicle_tech) {
        this.sea_vehicle_tech = sea_vehicle_tech;
    }

    public Integer getWeaponstech_score() {
        return weaponstech_score;
    }

    public void setWeaponstech_score(Integer weaponstech_score) {
        this.weaponstech_score = weaponstech_score;
    }
}
