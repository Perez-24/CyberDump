package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonsRoleBasedLifepathMedtech;
import com.example.cyberdump.Entities.ToonsRoleBasedLifepathNetrunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonsRoleBasedLifepathNetrunnerRepository extends JpaRepository<ToonsRoleBasedLifepathNetrunner, Integer> {

}
