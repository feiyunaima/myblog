package com.miku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miku.model.ArticleEntity;
import com.miku.repository.ArticleRepository;

@Controller
@RequestMapping("index")
public class IndexController {
	
	@Autowired
	ArticleRepository article;
	
	@RequestMapping
	public String index(ModelMap map) {
		List<ArticleEntity> articlelist = (List<ArticleEntity>) article.findAll();
		map.put("articlelist", articlelist);
		return "index";
	}
}
