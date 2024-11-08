package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.Armor;
import com.example.cyberdump.Entities.Toons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmorRepository extends JpaRepository<Armor, Integer> {

}
