package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonsLifepath;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToonsLifepathRepository extends JpaRepository<ToonsLifepath, Integer> {
    //Toons findById(ID id);
    //Toons findByHandleIgnoreCase(String handle);

}
