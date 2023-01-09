package com.prospecta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.prospecta.entity.Data;
import com.prospecta.entity.Entry;
import com.prospecta.entity.ResultDto;

@RestController
public class MyController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/entries/{category}")
	public List<ResultDto> getEntries(@PathVariable("category") String category){
		
		Data data = restTemplate.getForObject("https://api.publicapis.org/entries", Data.class);
		List<Entry> entries = data.getEntries();
		
		List<ResultDto> resultList = entries.stream().filter(e -> e.getCategory().equals(category)).map(e -> new ResultDto(e.getApi(),e.getDescription())).toList();
		
		return resultList;
	}
	
}
