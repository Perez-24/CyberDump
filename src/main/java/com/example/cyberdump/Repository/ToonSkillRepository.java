package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonSkills;
import com.example.cyberdump.Entities.Toons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonSkillRepository extends JpaRepository<ToonSkills, Integer> {
    //Toons findById(ID id);
}
