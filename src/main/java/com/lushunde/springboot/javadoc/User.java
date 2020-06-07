/**
 * Copyright © 2020, lushunde or www.lushunde.com site. All rights reserved.
 * @package springboot com.lushunde.springboot.javadoc 
 * @author bellus
 * @node 
 */
package com.lushunde.springboot.javadoc;

/**
 * @node 
 * @package springboot com.lushunde.springboot.javadoc 
 * @version 1.0
 * @date 2020年6月4日
 * @author bellus
 * @since JDK1.8
 */
public class User {
	
	private String name;
	
	
	private Integer age;

	
	private String sex;
	
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 * @author： bellus 2020年6月4日
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	/**
	 * @param name
	 * @param age
	 * @author： bellus
	 * @date： 2020年6月4日下午11:01:33
	 */
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * 
	 * @author： bellus
	 * @date： 2020年6月4日下午11:01:38
	 */
	public User() {
		super();
	}

	public String getSex() {
		return sex;
	}

	/**
	 * 设置性别
	 * @param sex   男性-{@link com.lushunde.springboot.javadoc.Constatn#SEX_MAN}，女性-{@link com.lushunde.springboot.javadoc.Constatn#SEX_WUMAN}
	 * @author： bellus 2020年6月4日
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
