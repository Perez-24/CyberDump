package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonsRoleBasedLifepathNetrunner;
import com.example.cyberdump.Entities.ToonsRoleBasedLifepathRockerboy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonsRoleBasedLifepathRockerboyRepository extends JpaRepository<ToonsRoleBasedLifepathRockerboy, Integer> {

}
