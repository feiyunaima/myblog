package com.miku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="writeblog")
public class WriteblogController {
	
	@RequestMapping(method = RequestMethod.POST)
	public String add(@RequestParam(value="userid") Integer userid,
					@RequestParam(value="articlebody") String articlebody,
					@RequestParam(value="title") String title) {
		
		return null;
	}
}
