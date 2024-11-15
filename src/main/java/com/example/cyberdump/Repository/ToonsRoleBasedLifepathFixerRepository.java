package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonsRoleBasedLifepathExec;
import com.example.cyberdump.Entities.ToonsRoleBasedLifepathFixer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonsRoleBasedLifepathFixerRepository extends JpaRepository<ToonsRoleBasedLifepathFixer, Integer> {

}
