package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ToonRelated.ToonsRoleBasedLifepathMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToonsRoleBasedLifepathMediaRepository extends JpaRepository<ToonsRoleBasedLifepathMedia, Integer> {

}
