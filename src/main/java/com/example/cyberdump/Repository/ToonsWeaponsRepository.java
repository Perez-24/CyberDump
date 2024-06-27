package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.Toons;
import com.example.cyberdump.Entities.ToonsWeapons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToonsWeaponsRepository extends JpaRepository<ToonsWeapons, Integer> {

}
