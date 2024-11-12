package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.MeleeWeapons;
import com.example.cyberdump.Entities.StreetDrugs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeleeWeaponsRepository extends JpaRepository<MeleeWeapons, Integer> {

}
