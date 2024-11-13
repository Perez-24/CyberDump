package com.example.cyberdump.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetrunnerProgramsRepository extends JpaRepository<NetrunnerProgramsRepository, Integer> {

}
