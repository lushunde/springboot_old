package com.lushunde.springboot.web.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lushunde.springboot.model.JsonResult;
import com.lushunde.springboot.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("getUserById")
	public JsonResult getUser(Long userId){
		logger.debug("查询用户userid={}，user={}",userId);
		JsonResult result = new JsonResult();
		
		User user = new User();
		user.setUserId(userId);
			
		result.setResult(0);
		result.setData(user);
		result.setUser(user);
		logger.info("查询用户userid={}，user={}",userId,user.toString());
		return result;
		
	}
	
}
