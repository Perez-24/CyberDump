package com.example.cyberdump.Repository;

import com.example.cyberdump.Entities.GeneralGearRelated.RangedWeaponAttachments;
import com.example.cyberdump.Entities.GeneralGearRelated.RangedWeapons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RangedWeaponAttachmentsRepository extends JpaRepository<RangedWeaponAttachments, Integer> {

}
