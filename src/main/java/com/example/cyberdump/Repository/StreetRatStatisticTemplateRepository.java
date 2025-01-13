package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.Core.CompositeKeys.StreetRatStatisticTemplateId;
import com.example.cyberdump.Entities.Core.Corporations;
import com.example.cyberdump.Entities.Core.SkillCategories;
import com.example.cyberdump.Entities.Core.StreetRatStatisticTemplates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StreetRatStatisticTemplateRepository extends JpaRepository<StreetRatStatisticTemplates, StreetRatStatisticTemplateId> {

}
