package com.springboot.api.servie;

import com.springboot.api.model.FamilyDetails;

public interface FamilyService {
	public String insertFamilyDetails(FamilyDetails familyDetails);

	public FamilyDetails getFamilyDetailsByname(String name);
	
	

}
