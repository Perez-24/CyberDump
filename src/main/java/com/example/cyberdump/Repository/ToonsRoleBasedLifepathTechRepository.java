package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonsRoleBasedLifepathSolo;
import com.example.cyberdump.Entities.ToonsRoleBasedLifepathTech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonsRoleBasedLifepathTechRepository extends JpaRepository<ToonsRoleBasedLifepathTech, Integer> {

}
