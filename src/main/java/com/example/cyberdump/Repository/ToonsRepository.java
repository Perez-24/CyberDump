package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.Toons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToonsRepository extends JpaRepository<Toons, Integer> {
    //Toons findById(ID id);
    Toons findByHandleIgnoreCase(String handle);
    //Integer findIdByHandleIgnoreCase(String handle);

}
