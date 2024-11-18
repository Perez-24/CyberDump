package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonsRoleBasedLifepathMedia;
import com.example.cyberdump.Entities.ToonsRoleBasedLifepathMedtech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonsRoleBasedLifepathMedtechRepository extends JpaRepository<ToonsRoleBasedLifepathMedtech, Integer> {

}
