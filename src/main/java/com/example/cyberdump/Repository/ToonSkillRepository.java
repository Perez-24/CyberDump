package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonRelated.ToonSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonSkillRepository extends JpaRepository<ToonSkills, Integer> {
    //Toons findById(ID id);
}
