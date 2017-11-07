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
 * 用户实体
 */
@Entity
@Table(name="sys_user")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;

	/**
	 * 用户名
	 */
	@Column(name="_user_name",unique=true)
	private String userName;
	
	/**
	 * 编号
	 */
	@Column(name="_code",unique=true)
	private String code;

	/**
	 * 头像
	 */
	@Column(name="_pic_url")
	private String picUrl;
	
	/**
	 * 密码
	 */
	@Column(name="_password")
	private String password;
	
	/**
	 * 昵称
	 */
	@Column(name="_nick")
	private String nick;
	
	/**
	 * 真实姓名
	 */
	@Column(name="_realName")
	private String realName;
	
	/**
	 * 性别（0.女，1.男）
	 */
	@Column(name="_sex")
	private Integer sex=1;
	
	/**
	 * 电话号码
	 */
	@Column(name="_phone")
	private String phone;

	/**
	 * QQ
	 */
	@Column(name="_qq")
	private String qq;
	
	/**
	 * 微信
	 */
	@Column(name="_weixin")
	private String weixin;
	
	/**
	 * 电子邮箱
	 */
	@Column(name="_email")
	private String email;
	
	/**
	 * 身份证
	 */
	@Column(name="_card")
	private String card;
	
	/**
	 * 地址
	 * */
	@Column(name="_address")
	private String address;

	/**
	 * 添加时间
	 */
	@Column(name="_add_time")
	private Date addTime=new Date();
	
	/**
	 * 加入时间
	 */
	@Column(name="_join_time")
	private Date joinTime;
	
	/**
	 * 离开时间
	 */
	@Column(name="_leave_time")
	private Date leaveTime;
	
	/**
	 * 账户状态(1.正常 2.冻结 3.删除)
	 */
	@Column(name="_status")
	private Integer status=1;
	
	/**
	 * 角色
	 */
	@ManyToOne
	@JoinColumn(name="_role")
	private RoleEntity roleName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWeixin() {
		return weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	public Date getLeaveTime() {
		return leaveTime;
	}

	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public RoleEntity getRoleName() {
		return roleName;
	}

	public void setRoleName(RoleEntity roleName) {
		this.roleName = roleName;
	}
	
}
