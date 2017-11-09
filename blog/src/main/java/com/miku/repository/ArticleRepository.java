package com.miku.repository;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.miku.model.ArticleEntity;
import com.miku.model.UserEntity;
@Repository
@Table(name="inv_article")
@Qualifier("articleRepository")
public interface ArticleRepository extends CrudRepository<ArticleEntity, Long >{
	
	 @Query("select t from ArticleEntity t where t.articlebody like %:name% or t.title like %:name% or t.user.nick like %:name%")
	 public ArticleEntity findByName(@Param("name") String name);
}
