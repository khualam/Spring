package com.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TextEditor {
	@Autowired
	private SpellChecker spellChecker;
	private String name;
	
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TextEditor(SpellChecker spellChecker, String name) {
		super();
		this.spellChecker = spellChecker;
		this.name = name;
	}
	
	public TextEditor() {
		super();
		System.out.println("coming in default TextEditor const");
	}
}
