package com.springboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.api.model.FamilyDetails;

@Repository
public interface FamilyRepository extends JpaRepository<FamilyDetails, String>{
	//JPQL-Java Persistence Language Query
	@Query(value="select * from family c where c.name = ?1",nativeQuery = true )
	FamilyDetails findByname(String name);

	

}
