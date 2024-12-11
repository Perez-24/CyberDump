package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.Core.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatisticRepository extends JpaRepository<Statistics, Integer> {

}
