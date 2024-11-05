package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.StreetDrugs;
import com.example.cyberdump.Entities.Toons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugsRepository extends JpaRepository<StreetDrugs, Integer> {
    //Toons findById(ID id);
    //Toons findByHandleIgnoreCase(String handle);
}
