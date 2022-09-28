package com.springboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.api.model.FamilyDetails;

@Repository
public interface FamilyRepository extends JpaRepository<FamilyDetails, Integer>{

}
