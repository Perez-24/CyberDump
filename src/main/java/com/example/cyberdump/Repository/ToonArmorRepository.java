package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonArmor;
import com.example.cyberdump.Entities.ToonWeapons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonArmorRepository extends JpaRepository<ToonArmor, Integer> {
    //Toons findById(ID id);
}
