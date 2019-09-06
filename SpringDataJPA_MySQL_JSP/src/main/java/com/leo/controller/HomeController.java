package com.leo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	/*
	 * home page
	 */
	@RequestMapping("/")
	public String home() {
		return "index";			//visit "/web-inf/jsp/index.jsp"
	}

}
