package com.lushunde.springboot.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户
 * @node 
 * @package springboot com.lushunde.springboot.model 
 * @version 1.0
 * @date 2020年6月7日
 * @author bellus
 * @since JDK1.8
 */
@ApiModel(value="User",description="用户")
public class User implements Serializable{
	private static final long serialVersionUID = -1446919202047721900L;
	@ApiModelProperty(name="userId",value="用户编号",dataType="Long")
	private Long userId;
	@ApiModelProperty(name="username",value="用户名称",dataType="String")
	private String username;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + "]";
	}
	
}
