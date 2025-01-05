package com.example.cyberdump.Controllers;

import com.example.cyberdump.Entities.ItemRelated.*;
import com.example.cyberdump.Repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemController {

    private final ArmorRepository armorRepository;
    private final RangedWeaponsRepository rangedWeaponsRepository;
    private final RangedWeaponAttachmentsRepository rangedWeaponAttachmentsRepository;
    private final MeleeWeaponsRepository meleeWeaponsRepository;
    private final CyberdeckHardwareRepository cyberdeckHardwareRepository;
    private final CyberwareRepository cyberwareRepository;
    private final StreetDrugsRepository streetDrugsRepository;


    // TODO : create Repositories + Entities + Endpoints
    // private final FashionRepository fashionRepository;
    // private final GeneralGearRepository generalGearRepository;
    // private final HomeDefenseRepository homeDefenseRepository;
    // private final NetrunnerProgramsRepository netrunnerProgramsRepository;
    // private final VehicleRepository vehicleRepository;





    public ItemController(StreetDrugsRepository streetDrugsRepository, ArmorRepository armorRepository, RangedWeaponsRepository rangedWeaponsRepository, RangedWeaponAttachmentsRepository rangedWeaponAttachmentsRepository, MeleeWeaponsRepository meleeWeaponsRepository, CyberdeckHardwareRepository cyberdeckHardwareRepository, CyberwareRepository cyberwareRepository) {
        this.streetDrugsRepository = streetDrugsRepository;
        this.armorRepository = armorRepository;
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

    // ADD NEW CYBERWARE
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addCyberware", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newCyberware(@RequestBody List<Cyberware>  newStuff) {
        ResponseEntity response = null;
        try{
            cyberwareRepository.saveAll(newStuff);
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
