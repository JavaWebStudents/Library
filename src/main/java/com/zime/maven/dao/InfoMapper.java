package com.zime.maven.dao;

import com.zime.maven.entity.Info;
import com.zime.maven.entity.InfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoMapper {
    long countByExample(InfoExample example);

    int deleteByExample(InfoExample example);

    int deleteByPrimaryKey(Integer bId);

    int insert(Info record);

    int insertSelective(Info record);

    List<Info> selectByExample(InfoExample example);

    Info selectByPrimaryKey(Integer bId);
    
    List<Info> selectByExampleWithBm(InfoExample example);

    Info selectByPrimaryKeyWithBm(Integer bId);

    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
}