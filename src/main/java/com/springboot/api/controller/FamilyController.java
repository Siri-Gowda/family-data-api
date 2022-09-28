package com.springboot.api.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.model.FamilyDetails;
import com.springboot.api.servie.FamilyService;

@RestController
@RequestMapping("/api")
public class FamilyController {
	
	
	//use log 4j to print logs in console
	private static final Logger logger = LoggerFactory.getLogger(FamilyController.class);
	
	
	@Autowired
	private FamilyService familyService;
	
	//creating post method
	@PostMapping("/family-details")
	public String addFamilyDetails (@RequestBody FamilyDetails familyDetails) {
		logger.info("Family Data::"+familyDetails);
		String response = "Data::"+familyDetails;
		return response;
		
	}
	@PostMapping("/add-family-details")
	public String insertFamilyDetails(@RequestBody FamilyDetails familyDetails) {
		logger.info("insert::"+familyDetails);
		String response = familyService.insertFamilyDetails(familyDetails);
		return response;
	}
	
	
	

}
