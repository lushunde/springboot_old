package com.lushunde.springboot.model;

import java.io.Serializable;

/**
 * 
 * @模块名：springboot
 * @包名：     model
 * @类名称：JsonResult
 * @类描述：所有返回json給前端JSON包装类
 * @版本：      1.0
 * @创建人：bellus
 * @创建时间：2019年6月22日上午2:27:45
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
