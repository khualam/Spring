package com.syne.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		// Navigates you to index.jsp page
		return "index";
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect() {
		System.out.println("redirect initiated at redirect()");
		return "redirect:finalPage"; // syntax is : "redirect:"{pageToredirect}
	}

	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage() {
		System.out.println("Redirection received here . . . at finalPage()");
		return "final";
	}
}