package com.miku.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miku.bean.Result;
import com.miku.model.ArticleEntity;
import com.miku.repository.ArticleRepository;

@Controller
@RequestMapping(value="writeblog")
public class WriteblogController {
	
	@Autowired
	ArticleRepository articleRepository;
	
	@RequestMapping("save")
	@ResponseBody
	public Result add(String articlebody,String title) {
		Result result = new Result();
		ArticleEntity article = new ArticleEntity();
		article.setCreatetime(new Date());
		article.setUpdatetime(new Date());
		article.setTitle(title);
		article.setMainbody(articlebody);
//		article.setUser();
		articleRepository.save(article);
		result.setSuccess(true);
		result.setMsg("添加成功");
		return result;
	}
}
