package com.miku.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miku.bean.Result;
import com.miku.model.ArticleEntity;
import com.miku.repository.ArticleRepository;

@Controller
@RequestMapping(value="article")
public class ArticleController {
	
	@Autowired
	ArticleRepository articleRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public String article(Long id,ModelMap map) {
		ArticleEntity article = articleRepository.findOne(id);
		map.put("article", article);
		return "article";
	}
	
	@RequestMapping("listAll")
	public String listAll(ModelMap map){
		List<ArticleEntity> articlelist = (List<ArticleEntity>) articleRepository.findAll();
		map.put("articlelist", articlelist);
		return "myblog";
	}
	
	@RequestMapping("list")
	public String list(ModelMap map,String name){
		List<ArticleEntity> articlelist = (List<ArticleEntity>) articleRepository.findByName(name);
		map.put("articlelist", articlelist);
		return "myblog";
	}
	
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
	
	@RequestMapping("update")
	@ResponseBody
	public Result update(String articlebody,String title,Long id) {
		Result result = new Result();
		ArticleEntity article = articleRepository.findOne(id);
		if(!"".equals(title)) {
			article.setTitle(title);
		}
		if(!"".equals(articlebody)) {
			article.setMainbody(articlebody);
		}
		article.setUpdatetime(new Date());
		articleRepository.save(article);
		result.setSuccess(true);
		result.setMsg("修改成功");
		return result;
	}
}
