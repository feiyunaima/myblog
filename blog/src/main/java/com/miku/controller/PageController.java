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
	
	@RequestMapping("/index")
	public String miku() {
		return "miku";
	}
	@RequestMapping("/myblog")
	public String myblog() {
		return "myblog";
	}
	
}
