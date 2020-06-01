package com.lushunde.dao;

import com.lushunde.model.Tcity;
import com.lushunde.model.TcityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcityMapper {
    long countByExample(TcityExample example);

    int deleteByExample(TcityExample example);

    int insert(Tcity record);

    int insertSelective(Tcity record);

    List<Tcity> selectByExample(TcityExample example);

    int updateByExampleSelective(@Param("record") Tcity record, @Param("example") TcityExample example);

    int updateByExample(@Param("record") Tcity record, @Param("example") TcityExample example);
}