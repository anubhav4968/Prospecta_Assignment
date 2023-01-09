package com.prospecta.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prospecta.EntryService;
import com.prospecta.entity.Entry;

@Service
public class EntryServiceImp implements EntryService{

	@Autowired
	private EntryRepo entryRepo;
	
	@Override
	public String addEntry(Entry entry) {
		
		Entry savedEntry=this.entryRepo.save(entry);
		return "Added";
	}

}
