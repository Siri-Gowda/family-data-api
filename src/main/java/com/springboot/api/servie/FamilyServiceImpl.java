package com.springboot.api.servie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.api.model.FamilyDetails;
import com.springboot.api.repository.FamilyRepository;

@Service
public class FamilyServiceImpl implements FamilyService {
	private static final Logger logger =LoggerFactory.getLogger(FamilyServiceImpl.class);
	
	@Autowired
	private FamilyRepository familyRepository;

	@Override
	public String insertFamilyDetails(FamilyDetails familyDetails) {
		logger.info("Data in Service layer::"+familyDetails);
		familyRepository.save(familyDetails);
		return "Data successfully inserted";
	}

	@Override
	public FamilyDetails getFamilyDetailsByname(String name) {
		logger.info("Name in Service layer::"+name);
		FamilyDetails response=familyRepository.findByname(name);
		return response;
	}

}
