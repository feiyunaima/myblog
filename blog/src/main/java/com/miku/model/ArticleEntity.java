package com.miku.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 文章
 *
 */
@Entity
@Table(name="inv_article")
public class ArticleEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	@ManyToOne
	@JoinColumn(name="_user")
	private UserEntity user;
	
	@Column(name="_articlebody")
	private String articlebody;
	
	@Column(name="_title")
	private String title;
	
	@Column(name="_createtime")
	private Date createtime;
	
	@Column(name="_updatetime")
	private Date updatetime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getArticlebody() {
		return articlebody;
	}

	public void setArticlebody(String articlebody) {
		this.articlebody = articlebody;
	}	
}
