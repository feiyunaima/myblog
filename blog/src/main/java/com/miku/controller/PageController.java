package com.miku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/index")
	public String index2() {
		return "index";
	}
	@RequestMapping("/miku")
	public String miku() {
		return "miku";
	}	
	@RequestMapping("/myblog")
	public String myblog() {		
		return "forward:/article/listAll";
	}
	@RequestMapping("/writeblog")
	public String writeblog() {
		return "forward:/article";
	}
	@RequestMapping("/tools")
	public String tools() {
		return "tools";
	}
	@RequestMapping("/heart")
	public String heart() {
		return "heart";
	}
	
}
