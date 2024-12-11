package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonRelated.ToonsRoleBasedLifepathMedtech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonsRoleBasedLifepathMedtechRepository extends JpaRepository<ToonsRoleBasedLifepathMedtech, Integer> {

}
