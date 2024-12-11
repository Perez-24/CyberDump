package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonRelated.ToonsRoleBasedLifepathSolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonsRoleBasedLifepathSoloRepository extends JpaRepository<ToonsRoleBasedLifepathSolo, Integer> {

}
