package com.study.biz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.study.biz.UserTest;
import com.study.biz.daoTEST;

@Service
public class TESTService {
	
	private final daoTEST dao;
	
	public TESTService(daoTEST dao) {
		this.dao = dao;
	}
	
	public List<UserTest> getUsers() {
		return dao.selectALL();
	}
}
