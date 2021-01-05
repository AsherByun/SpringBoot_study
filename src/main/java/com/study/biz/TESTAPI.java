package com.study.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TESTAPI {
	
	public static void main(String[] args) {
	
		daoTEST dao = new daoTEST();
		
		List<UserTest> list = dao.selectALL();
		for (UserTest user: list) {
			System.out.println(user.getName());
		}
	}

}
