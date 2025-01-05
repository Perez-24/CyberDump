package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ItemRelated.MeleeWeapons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeleeWeaponsRepository extends JpaRepository<MeleeWeapons, Integer> {

}
