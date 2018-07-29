package com.javapapers.spring4;

import org.springframework.stereotype.Component;

@Component
public class NumberGenerator implements Generator<Integer>{

	private Integer num = null;
	public NumberGenerator(){
		num = new Integer(1);	
	}
	
	@Override
	public Integer generate(){
		return num++;
	}
}
