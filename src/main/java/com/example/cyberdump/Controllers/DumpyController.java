package com.example.cyberdump.Controllers;

import com.example.cyberdump.Entities.Toons;
import com.example.cyberdump.Entities.ToonsLifepath;
import com.example.cyberdump.Repository.ToonsLifepathRepository;
import com.example.cyberdump.Repository.ToonsRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

public class DumpyController {

    //@Value("${secretparam}"):q

    private final ToonsRepository toonsRepository;
    private final ToonsLifepathRepository toonsLifepathRepository;



    public DumpyController(ToonsRepository toonsRepository, ToonsLifepathRepository toonsLifepathRepository) {
        this.toonsRepository = toonsRepository;
        this.toonsLifepathRepository = toonsLifepathRepository;
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
    @GetMapping("/handle/{handle}")
    String one(@PathVariable String handle) {
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
        Toons toon = null;
        try{
            // assumes toon was created, todo add if statement
            newLifepath.setToonId(toonsRepository.findByHandleIgnoreCase(savedLifepath.getHandle()).getToonId());
            savedLifepath = toonsLifepathRepository.save(newLifepath);
            if(savedLifepath.getHandle() != null){
                response = ResponseEntity.status(HttpStatus.CREATED).body("successful lifepath creation");
            }
           // ToonsLifepath savedLifepath =
        }
        catch (Exception e){
            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("deez nuts occurred due to "+ e.getMessage() );
        }

//        System.out.println(newToon.getHandle());
//        System.out.println(newToon.getRole());
//        System.out.println(newToon.getRole_level());

        return response;

    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/getAllToons")
    public Iterable<Toons> findAllToons() {

        Iterable<Toons> toonsList = this.toonsRepository.findAll();
        return toonsList;
    }



}
