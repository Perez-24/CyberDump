package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.GeneralGearRelated.Fashion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FashionRepository extends JpaRepository<Fashion, Integer> {

}
