package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ItemRelated.StreetDrugs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreetDrugsRepository extends JpaRepository<StreetDrugs, Integer> {

}
