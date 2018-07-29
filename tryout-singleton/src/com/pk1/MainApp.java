package com.pk1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
				
		TextEditor te = (TextEditor) context.getBean("textEditor"); 
	//	te.spellCheck();
		System.out.println(te.getSpellChecker().getS());
		
		SpellChecker s=(SpellChecker)context.getBean("spellChecker1");
		s.setS("kedar");
	//	s.checkSpelling();
		System.out.println(s.getS());
		
		System.out.println(te.getSpellChecker().getS());
		
		TextEditor te2 = (TextEditor) context.getBean("textEditor"); 
	//	te2.spellCheck();
		System.out.println(te2.getSpellChecker().getS());
		
		
		
		

	}

}
