package com.lushunde.dao;

import com.lushunde.model.Permission;
import com.lushunde.model.PermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * @node 
 * @package springboot  
 * @version 1.0
 * @date 2020年6月7日
 * @author bellus
 * @since JDK1.8
 */
public interface PermissionMapper {
	
	/**
	 * 
	 * @param example
	 * @return
	 * @author： bellus 2020年6月7日
	 */
    long countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);

    Permission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}