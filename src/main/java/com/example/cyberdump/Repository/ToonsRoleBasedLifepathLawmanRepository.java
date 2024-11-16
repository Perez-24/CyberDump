package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonsRoleBasedLifepathFixer;
import com.example.cyberdump.Entities.ToonsRoleBasedLifepathLawman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonsRoleBasedLifepathLawmanRepository extends JpaRepository<ToonsRoleBasedLifepathLawman, Integer> {

}
