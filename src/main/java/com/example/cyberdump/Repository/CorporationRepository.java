package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.Core.Corporations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorporationRepository extends JpaRepository<Corporations, Integer> {

}
