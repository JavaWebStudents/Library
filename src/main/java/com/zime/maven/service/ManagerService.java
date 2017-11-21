package com.zime.maven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zime.maven.dao.ManagerMapper;
import com.zime.maven.entity.Info;
import com.zime.maven.entity.InfoExample;
import com.zime.maven.entity.InfoExample.Criteria;
import com.zime.maven.entity.Manager;
import com.zime.maven.entity.ManagerExample;

@Service
public class ManagerService {
	
	@Autowired
	private ManagerMapper managerMapper;
	
	public List<Manager> getAll(){
		ManagerExample managerExample=new ManagerExample();
		//根据ID排序查看
		managerExample.setOrderByClause("m_id");
		//因为要获取编目，所以要用自己写的这个方法
		return managerMapper.selectByExampleWithLevel(managerExample);
	}
	
	public Manager getInfo(Integer id) {
		return managerMapper.selectByPrimaryKeyWithBm(id);
	}
	//检测姓名是不是可用
	public boolean validateName(String name) {
		InfoExample infoExample=new InfoExample();
		Criteria criteria=infoExample.createCriteria();
		criteria.andBNameEqualTo(name);
		long count=managerMapper.countByExample(infoExample);
		return count==0;
	}
	
	public void saveInfo(Info info){
		managerMapper.insertSelective(info);
	}
	
	public void updateInfo(Info info) {
		managerMapper.updateByPrimaryKeySelective(info);
	}
	
	public void deleteInfo(Integer id) {
		managerMapper.deleteByPrimaryKey(id);
	}
	//批量删除
	public void deleteInfoBatch(List<Integer> ids) {
		InfoExample infoExample=new InfoExample();
		Criteria criteria=infoExample.createCriteria();
		criteria.andBIdIn(ids);
		managerMapper.deleteByExample(infoExample);
	}
}
