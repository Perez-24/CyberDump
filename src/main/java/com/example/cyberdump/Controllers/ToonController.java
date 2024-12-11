package com.example.cyberdump.Controllers;

import com.example.cyberdump.Entities.ToonRelated.*;
import com.example.cyberdump.Repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ToonController {

    private final ToonsRepository toonsRepository;
    private final ToonsLifepathRepository toonsLifepathRepository;
    private final ToonSkillRepository toonSkillRepository;
    private final ToonStatisticsRepository toonStatisticsRepository;
    private final ToonWeaponsRepository toonWeaponsRepository;
    private final ToonArmorRepository toonArmorRepository;


    public ToonController(ToonsRepository toonsRepository, ToonsLifepathRepository toonsLifepathRepository, ToonSkillRepository toonSkillRepository, ToonStatisticsRepository toonStatisticsRepository, ToonWeaponsRepository toonWeaponsRepository, ToonArmorRepository toonArmorRepository) {
        this.toonsRepository = toonsRepository;
        this.toonsLifepathRepository = toonsLifepathRepository;
        this.toonSkillRepository = toonSkillRepository;
        this.toonStatisticsRepository = toonStatisticsRepository;
        this.toonWeaponsRepository = toonWeaponsRepository;
        this.toonArmorRepository = toonArmorRepository;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/toonID/{toonId}")
    Optional<Toons> one(@PathVariable Integer toonId) {

        return toonsRepository.findById(toonId);
        //.orElseThrow(() -> new UserNotFoundException(username));
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/toonSkill/{toonSkillID}")
    Optional<ToonSkills> getToonSkillByID(@PathVariable Integer toonSkillID) {

        return toonSkillRepository.findById(toonSkillID);
    }

    // TODO FIND ALL BY ID
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/toonWeapons/{toonID}")
    Optional<ToonWeapons> getToonWeaponsById(@PathVariable Integer toonID) {

        return toonWeaponsRepository.findById(toonID);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/toonArmor/{toonID}")
    Optional<ToonArmor> getToonArmorById(@PathVariable Integer toonID) {

        return toonArmorRepository.findById(toonID);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/toonStatistic/{toonStatisticID}")
    Optional<ToonStatistics> getToonStatisticByID(@PathVariable Integer toonStatisticID) {

        return toonStatisticsRepository.findById(toonStatisticID);
    }



    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getLifepathByHandle/{handle}")
    ToonsLifepath getLifepathByHandle(@PathVariable String handle) {

        return toonsLifepathRepository.findByHandleIgnoreCase(handle);
        //.orElseThrow(() -> new UserNotFoundException(username));
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/IdByHandle/{handle}")
    Long findIdByToonHandle(@PathVariable String handle) {
        try {
            Toons toon = toonsRepository.findByHandleIgnoreCase(handle);
            return toon.getToon_id();
        }
        catch (Exception e){
            return (long) -99;
        }
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/toonByHandle/{handle}")
    Toons findToonbyHandle(@PathVariable String handle) {

        Toons toon = toonsRepository.findByHandleIgnoreCase(handle);
            return toon;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/handle/{handle}")
    String getHandle(@PathVariable String handle) {
        Toons toon = toonsRepository.findByHandleIgnoreCase(handle);
        StringBuilder sb = new StringBuilder();
        String name = toon.getHandle();

        return sb.append(name).append("\t\t").append(toon.getRole()).append(" ").append(toon.getRole_level()).append("\t\t").append("HP:" + toon.getHp()).toString();

    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addToon", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newUser(@RequestBody Toons newToon) {
        //put check here to ensure db doesn't have duplicates
        Toons savedToon = null;
        ResponseEntity response = null;
        try{
            savedToon = toonsRepository.save(newToon);
            if(savedToon.getHandle() != null){
                response = ResponseEntity.status(HttpStatus.CREATED)
                        .body("successful toon creation");
            }
            //ToonsLifepath savedLifepath =
        }
        catch (Exception e){
            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("deez nuts occurred due to "+ e.getMessage() );
        }

//        System.out.println(newToon.getHandle());
//        System.out.println(newToon.getRole());
//        System.out.println(newToon.getRole_level());

        return response;
        //return newUser;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addLifepath", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newLifepath(@RequestBody ToonsLifepath newLifepath) {
        ToonsLifepath savedLifepath = null;
        ResponseEntity response = null;
        try{
            // assumes toon was created, todo add if statement
            newLifepath.setToonId(toonsRepository.findByHandleIgnoreCase(newLifepath.getHandle()).getToon_id());
            savedLifepath = toonsLifepathRepository.save(newLifepath);
            if(savedLifepath.getToonId() != null){
                response = ResponseEntity.status(HttpStatus.CREATED).body("successful lifepath creation");
            }
            else{
                response = ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Unable to create lifepath, toon does not exist");
            }
        }
        catch (Exception e){
            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("deez nuts occurred due to "+ e.getMessage() );
        }

        return response;

    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addToonSkills", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newToonSkills(@RequestBody ToonSkills newToonSkills) {
        ToonSkills savedToonSkills = null;
        ResponseEntity response = null;
        try{
            savedToonSkills = toonSkillRepository.save(newToonSkills);
                response = ResponseEntity.status(HttpStatus.CREATED).body("successful toonSkill creation");
        }
        catch (Exception e){
            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("deez nuts occurred due to "+ e.getMessage() );
        }

        return response;

    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addToonStatistics", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newToonStatistics(@RequestBody ToonStatistics newThing) {
        ToonStatistics savedThing = null;
        ResponseEntity response = null;
        try{
            savedThing = toonStatisticsRepository.save(newThing);
            response = ResponseEntity.status(HttpStatus.CREATED).body("successful Thing creation");
        }
        catch (Exception e){
            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("deez nuts occurred due to "+ e.getMessage() );
        }

        return response;

    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addToonWeapon", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newToonWeapon(@RequestBody List<ToonWeapons>  newThing) {
        ResponseEntity response = null;
        try{
            toonWeaponsRepository.saveAll(newThing);
            return ResponseEntity.status(HttpStatus.CREATED).body("successful toonWeapon creation");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("deez nuts occurred due to "+ e.getMessage() );
        }

    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addToonArmor", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newToonArmor(@RequestBody List<ToonArmor>  newThing) {
        ResponseEntity response = null;
        try{
            toonArmorRepository.saveAll(newThing);
            return ResponseEntity.status(HttpStatus.CREATED).body("successful toonArmor creation");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("deez nuts occurred due to "+ e.getMessage() );
        }

    }


    /* GET ALL ENDPOINTS */

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllToons")
    public Iterable<Toons> findAllToons() {

        Iterable<Toons> toonsList = this.toonsRepository.findAll();
        return toonsList;
    }



}
