package com.miku.repository;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miku.model.ArticleEntity;
@Repository
@Table(name="inv_article")
@Qualifier("articleRepository")
public interface ArticleRepository extends CrudRepository<ArticleEntity, Long >{
	
}
