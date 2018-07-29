package com.test;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SpellChecker {
	
	String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public SpellChecker(String s) {
		super();
		this.s = s;
	}
	
	
	public SpellChecker() {
		super();
		System.out.println("coming in default SpellChecker const");
	}
	

}
