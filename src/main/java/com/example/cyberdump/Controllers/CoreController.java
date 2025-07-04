package com.example.cyberdump.Controllers;

import com.example.cyberdump.Entities.Core.CompositeKeys.StreetRatStatisticTemplateId;
import com.example.cyberdump.Entities.Core.SkillCategories;
import com.example.cyberdump.Entities.Core.Skills;
import com.example.cyberdump.Entities.Core.Statistics;
import com.example.cyberdump.Entities.Core.StreetRatStatisticTemplates;
import com.example.cyberdump.Repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CoreController {

    private final SkillsRepository skillsRepository;
    private final SkillCategoriesRepository skillCategoriesRepository;
    private final StatisticRepository statisticRepository;
    private final StreetRatStatisticTemplateRepository streetRatStatisticTemplateRepository;



    public CoreController(SkillsRepository skillsRepository, SkillCategoriesRepository skillCategoriesRepository, StatisticRepository statisticRepository, StreetRatStatisticTemplateRepository streetRatStatisticTemplateRepository) {
        this.skillsRepository = skillsRepository;
        this.skillCategoriesRepository = skillCategoriesRepository;
        this.statisticRepository = statisticRepository;
        this.streetRatStatisticTemplateRepository = streetRatStatisticTemplateRepository;
    }


    //SANITY CHECK ENDPOINTT
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/greetFromCore")
    public String greetUserFromCore(){
        return "Hello User From Core";
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

    // GET Streetrat Template by role_id and stat_roll_id
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/streetRatTemplateID/{role_id}/{stat_roll_id}")
    Optional<StreetRatStatisticTemplates> getSkillCategoryById(@PathVariable Integer role_id, @PathVariable Integer stat_roll_id) {
        return streetRatStatisticTemplateRepository.findById(new StreetRatStatisticTemplateId(role_id,stat_roll_id));
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

    // GET ALL SKILL CATEGORIES
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllStatisticTemplates")
    public Iterable<StreetRatStatisticTemplates> FindAllStatisticTemplates() {
        Iterable<StreetRatStatisticTemplates> stuffList = this.streetRatStatisticTemplateRepository.findAll();
        return stuffList;
    }

    // *******************************************
    // POST ENDPOINTS
    // *******************************************

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

    // ADD NEW STREETRAT TEMPLATES
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/addStreetRatTemplates", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> newStreetratTemplates(@RequestBody List<StreetRatStatisticTemplates>  newThing) {
        ResponseEntity response = null;
        try{
            streetRatStatisticTemplateRepository.saveAll(newThing);
            return ResponseEntity.status(HttpStatus.CREATED).body("successful thing creation");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("deez nuts occurred due to "+ e.getMessage() );
        }

    }


}
