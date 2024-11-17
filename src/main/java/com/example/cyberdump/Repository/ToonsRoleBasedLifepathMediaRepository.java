package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonsRoleBasedLifepathLawman;
import com.example.cyberdump.Entities.ToonsRoleBasedLifepathMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonsRoleBasedLifepathMediaRepository extends JpaRepository<ToonsRoleBasedLifepathMedia, Integer> {

}
