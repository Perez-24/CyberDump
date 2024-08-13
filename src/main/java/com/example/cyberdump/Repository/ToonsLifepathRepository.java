package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonsLifepath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonsLifepathRepository extends JpaRepository<ToonsLifepath, Integer> {
    //Toons findById(ID id);
    //Toons findByHandleIgnoreCase(String handle);
    ToonsLifepath findByHandleIgnoreCase(String handle);


}
