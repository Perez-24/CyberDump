package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.Corporations;
import com.example.cyberdump.Entities.Cyberware;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberwareRepository extends JpaRepository<Cyberware, Integer> {

}
