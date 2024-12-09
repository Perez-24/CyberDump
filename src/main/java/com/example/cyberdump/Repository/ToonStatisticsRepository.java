package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonSkills;
import com.example.cyberdump.Entities.ToonStatistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonStatisticsRepository extends JpaRepository<ToonStatistics, Integer> {
    //Toons findById(ID id);
}
