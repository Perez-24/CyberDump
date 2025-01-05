package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.ItemRelated.RangedWeaponAttachments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RangedWeaponAttachmentsRepository extends JpaRepository<RangedWeaponAttachments, Integer> {

}
