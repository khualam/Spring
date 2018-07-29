package com.javapapers.spring4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.javapapers.spring4.AlphabetGenerator;
import com.javapapers.spring4.Generator;

@Service

public class AlphabetService {

	//@Autowired
	//private AlphabetGenerator generator;

	@Autowired
	private Generator<String> generator;

	
	public AlphabetService(){	}
	
	public String getAlphabet(){
		return generator.generate();
	}	
}
