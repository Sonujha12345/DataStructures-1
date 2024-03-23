package com.kodnest.TuneHub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodnest.TuneHub.entity.Data;
import com.kodnest.TuneHub.serviceimpl.DataServiceImpl;

@Controller
public class DataController {

	@Autowired
	DataServiceImpl dataServiceImpl;
	
	@PostMapping(value = "/register")
	public String addData(@ModelAttribute Data data) {
		
		System.out.println(data.getUsername()+" "+data.getEmail()+
		" "+data.getPassword()+" "+data.getGender()+" "+data.getRole() +
		" "+data.getAddress());
		
		dataServiceImpl.addData(data);
		
		return "home";
		
	}
}
