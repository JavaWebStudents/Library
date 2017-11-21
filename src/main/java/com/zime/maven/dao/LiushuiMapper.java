package com.zime.maven.dao;

import com.zime.maven.entity.Liushui;
import com.zime.maven.entity.LiushuiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiushuiMapper {
    long countByExample(LiushuiExample example);

    int deleteByExample(LiushuiExample example);

    int deleteByPrimaryKey(Integer lId);

    int insert(Liushui record);

    int insertSelective(Liushui record);

    List<Liushui> selectByExample(LiushuiExample example);

    Liushui selectByPrimaryKey(Integer lId);

    int updateByExampleSelective(@Param("record") Liushui record, @Param("example") LiushuiExample example);

    int updateByExample(@Param("record") Liushui record, @Param("example") LiushuiExample example);

    int updateByPrimaryKeySelective(Liushui record);

    int updateByPrimaryKey(Liushui record);
}