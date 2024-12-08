package com.example.cyberdump.Controllers;

import com.example.cyberdump.Entities.*;
import com.example.cyberdump.Repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DumpyController {

    private final ToonsRepository toonsRepository;
    private final StreetDrugsRepository streetDrugsRepository;
    private final ToonsLifepathRepository toonsLifepathRepository;
    private final ArmorRepository armorRepository;
    private final SkillsRepository skillsRepository;
    private final SkillCategoriesRepository skillCategoriesRepository;
    private final StatisticRepository statisticRepository;



    public DumpyController(ToonsRepository toonsRepository, ToonsLifepathRepository toonsLifepathRepository, StreetDrugsRepository streetDrugsRepository, ArmorRepository armorRepository, SkillsRepository skillsRepository, SkillCategoriesRepository skillCategoriesRepository, StatisticRepository statisticRepository) {
        this.toonsRepository = toonsRepository;
        this.toonsLifepathRepository = toonsLifepathRepository;
        this.streetDrugsRepository = streetDrugsRepository;
        this.armorRepository = armorRepository;
        this.skillsRepository = skillsRepository;
        this.skillCategoriesRepository = skillCategoriesRepository;
        this.statisticRepository = statisticRepository;
    }



    //private String secretparam;

//    //public AuthController(UserInfoRepository userInfoRepository) {
//        this.userInfoRepository = userInfoRepository;
//    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/greet")
    public String greetUser(){
        return "Hello User";
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/toonID/{toonId}")
    Optional<Toons> one(@PathVariable Integer toonId) {

        return toonsRepository.findById(toonId);
        //.orElseThrow(() -> new UserNotFoundException(username));
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/skillID/{skillId}")
    Optional<Skills> getSkillById(@PathVariable Integer skillId) {

        return skillsRepository.findById(skillId);
        //.orElseThrow(() -> new UserNotFoundException(username));
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/statisticID/{statisticId}")
    Optional<Statistics> getStatisticById(@PathVariable Integer statisticId) {

        return statisticRepository.findById(statisticId);
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

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addArmor", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newArmor(@RequestBody Armor newArmor) {
        Armor savedArmor = null;
        ResponseEntity response = null;
        try{
            savedArmor = armorRepository.save(newArmor);
            response = ResponseEntity.status(HttpStatus.CREATED)
                    .body("successful armor creation");
        }
        catch (Exception e){
            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("deez nuts occurred due to "+ e.getMessage() );
        }

        return response;
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


    /* GET ALL ENDPOINTS */

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllToons")
    public Iterable<Toons> findAllToons() {

        Iterable<Toons> toonsList = this.toonsRepository.findAll();
        return toonsList;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllDrugs")
    public Iterable<StreetDrugs> findAllDrugs() {

        Iterable<StreetDrugs> drugList = this.streetDrugsRepository.findAll();
        return drugList;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllArmor")
    public Iterable<Armor> findAllArmor() {

        Iterable<Armor> armorList = this.armorRepository.findAll();
        return armorList;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllStatistics")
    public Iterable<Statistics> findAllStatistics() {

        Iterable<Statistics> statList = this.statisticRepository.findAll();
        return statList;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllSkillCategories")
    public Iterable<SkillCategories> findAllSkillCategories() {

        Iterable<SkillCategories> scList = this.skillCategoriesRepository.findAll();
        return scList;
    }



}
