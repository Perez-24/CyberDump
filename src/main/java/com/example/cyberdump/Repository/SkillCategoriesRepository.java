package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.SkillCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillCategoriesRepository extends JpaRepository<SkillCategories, Integer> {

}
