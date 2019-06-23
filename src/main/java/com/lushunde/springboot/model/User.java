package com.lushunde.springboot.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @模块名：springboot
 * @包名：     model
 * @类名称：User
 * @类描述：用户信息
 * @版本：      1.0
 * @创建人：bellus
 * @创建时间：2019年6月22日上午2:41:35
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
