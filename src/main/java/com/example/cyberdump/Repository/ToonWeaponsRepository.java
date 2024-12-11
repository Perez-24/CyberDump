package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonRelated.ToonWeapons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonWeaponsRepository extends JpaRepository<ToonWeapons, Integer> {
    //Toons findById(ID id);
}
