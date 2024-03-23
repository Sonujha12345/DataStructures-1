package com.kodnest.TuneHub.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.TuneHub.entity.Data;
import com.kodnest.TuneHub.repository.DataRepository;
import com.kodnest.TuneHub.service.DataService;
@Service
public class DataServiceImpl implements DataService {

	@Autowired
	DataRepository dataRepository;

	public String addData(Data data) {
		dataRepository.save(data);
		return "Add success...";
		
	}
}
