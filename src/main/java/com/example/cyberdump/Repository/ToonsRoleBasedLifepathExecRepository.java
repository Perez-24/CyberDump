package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.StreetDrugs;
import com.example.cyberdump.Entities.ToonsRoleBasedLifepathExec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonsRoleBasedLifepathExecRepository extends JpaRepository<ToonsRoleBasedLifepathExec, Integer> {

}
