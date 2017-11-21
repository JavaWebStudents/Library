package com.zime.maven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zime.maven.dao.InfoMapper;
import com.zime.maven.entity.Info;
import com.zime.maven.entity.InfoExample;
import com.zime.maven.entity.InfoExample.Criteria;

@Service
public class InfoService {
	
	@Autowired
	private InfoMapper infoMapper;
	
	public List<Info> getAll(){
		InfoExample infoExample=new InfoExample();
		//根据ID排序查看
		infoExample.setOrderByClause("b_id");
		//因为要获取编目，所以要用自己写的这个方法
		return infoMapper.selectByExampleWithBm(infoExample);
	}
	
	public Info getInfo(Integer id) {
		return infoMapper.selectByPrimaryKeyWithBm(id);
	}
	//检测姓名是不是可用
	public boolean validateName(String name) {
		InfoExample infoExample=new InfoExample();
		Criteria criteria=infoExample.createCriteria();
		criteria.andBNameEqualTo(name);
		long count=infoMapper.countByExample(infoExample);
		return count==0;
	}
	
	public void saveInfo(Info info){
		infoMapper.insertSelective(info);
	}
	
	public void updateInfo(Info info) {
		infoMapper.updateByPrimaryKeySelective(info);
	}
	
	public void deleteInfo(Integer id) {
		infoMapper.deleteByPrimaryKey(id);
	}
	//批量删除
	public void deleteInfoBatch(List<Integer> ids) {
		InfoExample infoExample=new InfoExample();
		Criteria criteria=infoExample.createCriteria();
		criteria.andBIdIn(ids);
		infoMapper.deleteByExample(infoExample);
	}
}
