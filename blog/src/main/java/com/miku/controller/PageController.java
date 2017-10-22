package com.miku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

	@RequestMapping("/")
	public String index() {
		return "miku";
	}
	
	@RequestMapping("/{page}")
	public String goPage(@PathVariable("page") String page) {
		System.out.println("123");
		return page;
	}
}
