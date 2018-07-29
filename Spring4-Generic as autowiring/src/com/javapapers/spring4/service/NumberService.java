package com.javapapers.spring4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javapapers.spring4.Generator;
import com.javapapers.spring4.NumberGenerator;

@Service
public class NumberService {

	//@Autowired
	//private NumberGenerator generator;
	
	@Autowired
	private Generator<Integer> generator;

	

		
	public NumberService(){
		
	}
	
	public Integer getNumber(){
		return generator.generate();
	}
}
