package com.lushunde.springboot.web.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lushunde.springboot.model.JsonResult;
import com.lushunde.springboot.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/user")
@Api(tags="用户管理")
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="getUserById",method=RequestMethod.GET)
	@ApiOperation(value="获取用户", notes="根据用户编号查询用户后返回用户对象")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType="query", name = "userId", value = "用户编号", required = true, dataType = "Long")
	})
	@ApiResponses({
		@ApiResponse(code=200,message="成功",response=JsonResult.class),
		@ApiResponse(code=500,message="服务器异常",response=JsonResult.class)
	})
	public JsonResult getUserById(@RequestParam(required=true) Long userId){
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
	
	@RequestMapping(value="deleteUserById",method=RequestMethod.POST)
	@ApiOperation(value="删除用户", notes="根据用户编号删除用户账号")
	@ApiImplicitParam(paramType="query", name = "userId", value = "用户编号", required = true, dataType = "Long")
	public JsonResult deleteUserById(@RequestParam(required=true) Long userId){
		logger.debug("删除用户userid={}，user={}",userId);
		JsonResult result = new JsonResult();
		
		User user = new User();
		user.setUserId(userId);
			
		result.setResult(0);
		result.setData(user);
		result.setUser(user);
		logger.info("删除用户userid={}，user={}",userId,user.toString());
		return result;
		
	}
	
	
	
}
