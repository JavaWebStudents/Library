package com.zime.maven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zime.maven.dao.BmMapper;
import com.zime.maven.entity.Bm;

@Service
public class BorrowService {
	
	@Autowired
	private BmMapper bmMapper;
	
	public List<Bm> getAll(){
		//括号里面写的是条件，由于搜索全部信息没有条件，所以写null
		return bmMapper.selectByExample(null);
	}
	
	public Bm getBm(Integer id){
		//因为是查询单个信息，所以是有条件的，条件就是ID，所以括号里面写ID
		return bmMapper.selectByPrimaryKey(id);
	}
}
