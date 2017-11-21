package com.zime.maven.dao;

import com.zime.maven.entity.Level;
import com.zime.maven.entity.LevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LevelMapper {
    long countByExample(LevelExample example);

    int deleteByExample(LevelExample example);

    int deleteByPrimaryKey(Integer leId);

    int insert(Level record);

    int insertSelective(Level record);

    List<Level> selectByExample(LevelExample example);

    Level selectByPrimaryKey(Integer leId);

    int updateByExampleSelective(@Param("record") Level record, @Param("example") LevelExample example);

    int updateByExample(@Param("record") Level record, @Param("example") LevelExample example);

    int updateByPrimaryKeySelective(Level record);

    int updateByPrimaryKey(Level record);
}