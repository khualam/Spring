package com.test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestSpellCheckerMain {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor textEditor = (TextEditor) context.getBean("textEditor");
		System.out.println(textEditor.getSpellChecker().getS());
		
		SpellChecker spellChecker = (SpellChecker) context.getBean("spellChecker");
		spellChecker.setS("Vishu");
		System.out.println(spellChecker.getS());
		
		System.out.println(textEditor.getSpellChecker().getS());
		
		TextEditor textEditor2 = (TextEditor) context.getBean("textEditor");
		System.out.println(textEditor2.getSpellChecker().getS());
		context.close();
	}
}
