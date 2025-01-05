package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ItemRelated.CyberdeckHardware;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberdeckHardwareRepository extends JpaRepository<CyberdeckHardware, Integer> {

}
