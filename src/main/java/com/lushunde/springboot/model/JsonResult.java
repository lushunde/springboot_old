package com.lushunde.springboot.model;

import java.io.Serializable;

/**
 * @node 所有返回json給前端JSON包装类
 * @package springboot com.lushunde.springboot.model 
 * @version 1.0
 * @date 2020年6月7日
 * @author bellus
 * @since JDK1.8
 */
public class JsonResult implements Serializable{
	private static final long serialVersionUID = -3961047474891959005L;
	/**
	 * 请求状态 0-成功，1-异常
	 */
	private int result = 0;
	/**
	 * 状态码 6位数字符串    
	 */
	private String code;
	/**
	 * 返回信息
	 */
	private String message;
	/**
	 * 返回数据
	 */
	private Object data;
	/**
	 * 返回用户信息
	 */
	private User user;
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
