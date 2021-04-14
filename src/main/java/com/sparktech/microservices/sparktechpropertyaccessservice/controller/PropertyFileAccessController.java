package com.sparktech.microservices.sparktechpropertyaccessservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sparktech.microservices.sparktechpropertyaccessservice.beans.PropertyAccessBean;
import com.sparktech.microservices.sparktechpropertyaccessservice.beans.PropertyAccessValue;

@RestController
@RequestMapping("/access")
public class PropertyFileAccessController {
	
	@Autowired
	PropertyAccessBean propertyAccessBean;
	
	@GetMapping("/accessPropertyFile")
	public PropertyAccessValue propertyFileAccess() {
		return new PropertyAccessValue(propertyAccessBean.getName(), propertyAccessBean.getDescription());
	}
	
	
	
	
}
