package com.example.cyberdump.Controllers;

import com.example.cyberdump.CyberDumpApplication;
import com.example.cyberdump.Entities.Core.SkillCategories;
import com.example.cyberdump.Entities.Core.Skills;
import com.example.cyberdump.Entities.Core.Statistics;
import com.example.cyberdump.Entities.GeneralGearRelated.*;
import com.example.cyberdump.Repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {

    private final StreetDrugsRepository streetDrugsRepository;
    private final ArmorRepository armorRepository;
    private final SkillsRepository skillsRepository;
    private final SkillCategoriesRepository skillCategoriesRepository;
    private final StatisticRepository statisticRepository;
    private final RangedWeaponsRepository rangedWeaponsRepository;
    private final RangedWeaponAttachmentsRepository rangedWeaponAttachmentsRepository;
    private final MeleeWeaponsRepository meleeWeaponsRepository;
    private final CyberdeckHardwareRepository cyberdeckHardwareRepository;
    private final CyberwareRepository cyberwareRepository;




    public ItemController(StreetDrugsRepository streetDrugsRepository, ArmorRepository armorRepository, SkillsRepository skillsRepository, SkillCategoriesRepository skillCategoriesRepository, StatisticRepository statisticRepository, RangedWeaponsRepository rangedWeaponsRepository, RangedWeaponAttachmentsRepository rangedWeaponAttachmentsRepository, MeleeWeaponsRepository meleeWeaponsRepository, CyberdeckHardwareRepository cyberdeckHardwareRepository, CyberwareRepository cyberwareRepository) {
        this.streetDrugsRepository = streetDrugsRepository;
        this.armorRepository = armorRepository;
        this.skillsRepository = skillsRepository;
        this.skillCategoriesRepository = skillCategoriesRepository;
        this.statisticRepository = statisticRepository;
        this.rangedWeaponsRepository = rangedWeaponsRepository;
        this.rangedWeaponAttachmentsRepository = rangedWeaponAttachmentsRepository;
        this.meleeWeaponsRepository = meleeWeaponsRepository;
        this.cyberdeckHardwareRepository = cyberdeckHardwareRepository;
        this.cyberwareRepository = cyberwareRepository;
    }


    //SANITY CHECK ENDPOINT
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/greet")
    public String greetUser(){
        return "Hello User";
    }

    // *******************************************
    // GET SINGLE ENDPOINTS
    // *******************************************

    // GET Skill by skill_id
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/skillID/{skillId}")
    Optional<Skills> getSkillById(@PathVariable Integer skillId) {

        return skillsRepository.findById(skillId);
        //.orElseThrow(() -> new UserNotFoundException(username));
    }

    // GET Statistic by statistic_id
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/statisticID/{statisticId}")
    Optional<Statistics> getStatisticById(@PathVariable Integer statisticId) {

        return statisticRepository.findById(statisticId);
    }

    // GET Skill Category by skill_category_id
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/skillCategoryID/{skillCategoryID}")
    Optional<SkillCategories> getSkillCategoryById(@PathVariable Integer skillCategoryID) {

        return skillCategoriesRepository.findById(skillCategoryID);
    }

    // GET Ranged Weapon by rngd_wpn_id
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/rangedWeaponById/{id}")
    Optional<RangedWeapons> getRangedWeaponByID(@PathVariable Integer id) {
        return rangedWeaponsRepository.findById(id);
    }

    // GET Ranged Weapon Attachment by rngd_wpn_atchmnt_id
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/rangedWeaponAttachmentById/{id}")
    Optional<RangedWeaponAttachments> getRangedWeaponAttachmentByID(@PathVariable Integer id) {
        return rangedWeaponAttachmentsRepository.findById(id);
    }

    // GET Melee Weapon by mle_wpn_id
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/meleeWeaponById/{id}")
    Optional<MeleeWeapons> getMeleeWeaponByID(@PathVariable Integer id) {
        return meleeWeaponsRepository.findById(id);
    }

    // GET Cyberware by cyberware_id
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/cyberwareById/{id}")
    Optional<Cyberware> getCyberwareByID(@PathVariable Integer id) {
        return cyberwareRepository.findById(id);
    }


    // *******************************************
    // GET ALL ENDPOINTS
    // *******************************************

    // GET ALL SKILLS
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllSkills")
    public Iterable<Skills> findAllSkills() {

        Iterable<Skills> stuff = this.skillsRepository.findAll();
        return stuff;
    }

    // GET ALL DRUGS
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllDrugs")
    public Iterable<StreetDrugs> findAllDrugs() {

        Iterable<StreetDrugs> drugList = this.streetDrugsRepository.findAll();
        return drugList;
    }

    //GET ALL ARMOR
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllArmor")
    public Iterable<Armor> findAllArmor() {

        Iterable<Armor> armorList = this.armorRepository.findAll();
        return armorList;
    }

    // GET ALL STATISTICS
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllStatistics")
    public Iterable<Statistics> findAllStatistics() {

        Iterable<Statistics> statList = this.statisticRepository.findAll();
        return statList;
    }

    // GET ALL SKILL CATEGORIES
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllSkillCategories")
    public Iterable<SkillCategories> findAllSkillCategories() {

        Iterable<SkillCategories> scList = this.skillCategoriesRepository.findAll();
        return scList;
    }

    // GET ALL RANGED WEAPONS
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllRangedWeapons")
    public Iterable<RangedWeapons> findAllRangedWeapons() {

        Iterable<RangedWeapons> result = this.rangedWeaponsRepository.findAll();
        return result;
    }

    // GET ALL RANGED WEAPON ATTACHMENTS
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllRangedWeaponAttachments")
    public Iterable<RangedWeaponAttachments> findAllRangedWeaponAttachments() {

        Iterable<RangedWeaponAttachments> result = this.rangedWeaponAttachmentsRepository.findAll();
        return result;
    }

    // GET ALL MELEE WEAPONS
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllMeleeWeapons")
    public Iterable<MeleeWeapons> findAllMeleeWeapons() {

        Iterable<MeleeWeapons> result = this.meleeWeaponsRepository.findAll();
        return result;
    }

    // GET ALL Cyberdeck Hardware
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllCyberdeckHardware")
    public Iterable<CyberdeckHardware> findAllCyberdeckHardware() {

        Iterable<CyberdeckHardware> result = this.cyberdeckHardwareRepository.findAll();
        return result;
    }

    // GET ALL Cyberware
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllCyberware")
    public Iterable<Cyberware> findAllCyberware() {

        Iterable<Cyberware> result = this.cyberwareRepository.findAll();
        return result;
    }

    // *******************************************
    // POST ENDPOINTS
    // *******************************************

    // ADD NEW DRUG
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addDrug", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newDrug(@RequestBody StreetDrugs newDrug) {
        StreetDrugs savedDrug = null;
        ResponseEntity response = null;
        try{
            savedDrug = streetDrugsRepository.save(newDrug);
                response = ResponseEntity.status(HttpStatus.CREATED)
                        .body("successful drug creation");
        }
        catch (Exception e){
            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("deez nuts occurred due to "+ e.getMessage() );
        }

        return response;
    }

    // ADD NEW SKILL CATEGORY
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addSkillCategory", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newSkillCategory(@RequestBody List<SkillCategories>  newSkillType) {
            ResponseEntity response = null;
            try{
                skillCategoriesRepository.saveAll(newSkillType);
                return ResponseEntity.status(HttpStatus.CREATED).body("successful skill Type creation");
            }
            catch (Exception e){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("deez nuts occurred due to "+ e.getMessage() );
            }

    }

    // ADD NEW STATISTICS
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addStatistic", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newStatistic(@RequestBody List<Statistics>  newStatistic) {
        ResponseEntity response = null;
        try{
            statisticRepository.saveAll(newStatistic);
            return ResponseEntity.status(HttpStatus.CREATED).body("successful statistic creation");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("deez nuts occurred due to "+ e.getMessage() );
        }

    }

    // ADD NEW SKILLS
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addSkills", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newSkills(@RequestBody List<Skills>  newSkills) {
        ResponseEntity response = null;
        try{
            skillsRepository.saveAll(newSkills);
            return ResponseEntity.status(HttpStatus.CREATED).body("successful skill creation");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("deez nuts occurred due to "+ e.getMessage() );
        }

    }

    // ADD NEW ARMOR
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addArmor", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newArmor(@RequestBody List<Armor>  newStuff) {
        ResponseEntity response = null;
        try{
            armorRepository.saveAll(newStuff);
            return ResponseEntity.status(HttpStatus.CREATED).body("successful thing creation");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("deez nuts occurred due to "+ e.getMessage() );
        }

    }

    // ADD NEW RANGED WEAPON
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addRangedWeapons", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newRangedWeapons(@RequestBody List<RangedWeapons>  newStuff) {
        ResponseEntity response = null;
        try{
            rangedWeaponsRepository.saveAll(newStuff);
            return ResponseEntity.status(HttpStatus.CREATED).body("successful thing creation");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("deez nuts occurred due to "+ e.getMessage() );
        }

    }

    // ADD NEW RANGED ATTACHMENT WEAPON
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addRangedWeaponAttachment", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newRangedAttachment(@RequestBody List<RangedWeaponAttachments>  newStuff) {
        ResponseEntity response = null;
        try{
            rangedWeaponAttachmentsRepository.saveAll(newStuff);
            return ResponseEntity.status(HttpStatus.CREATED).body("successful thing creation");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("deez nuts occurred due to "+ e.getMessage() );
        }

    }

    // ADD NEW MELEE WEAPON
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addMeleeWeapons", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newMeleeWeapons(@RequestBody List<MeleeWeapons>  newStuff) {
        ResponseEntity response = null;
        try{
            meleeWeaponsRepository.saveAll(newStuff);
            return ResponseEntity.status(HttpStatus.CREATED).body("successful thing creation");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("deez nuts occurred due to "+ e.getMessage() );
        }

    }

    // ADD NEW CYBDERDECK HARDWARE
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addCybderdeckHardware", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newCyberdeckHardware(@RequestBody List<CyberdeckHardware>  newStuff) {
        ResponseEntity response = null;
        try{
            cyberdeckHardwareRepository.saveAll(newStuff);
            return ResponseEntity.status(HttpStatus.CREATED).body("successful thing creation");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("deez nuts occurred due to "+ e.getMessage() );
        }

    }


}
