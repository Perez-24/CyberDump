package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ItemRelated.RangedWeapons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RangedWeaponsRepository extends JpaRepository<RangedWeapons, Integer> {

}
