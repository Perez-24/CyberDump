package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ItemRelated.GeneralGear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralGearRepository extends JpaRepository<GeneralGear, Integer> {

}
