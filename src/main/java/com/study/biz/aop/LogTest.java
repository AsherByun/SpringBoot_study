package com.study.biz.aop;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.study.biz.UserTest;

public class LogTest {
	
	public void start(JoinPoint jp) {
		System.out.println("-----------------");
		System.out.println("------start------");
		System.out.println("----"+jp.getSignature());
		System.out.println("----"+jp.getArgs());
		System.out.println("-----------------");
	}

	public void end() {
		System.out.println("-----------------");
		System.out.println("-------end-------");
		System.out.println("-----------------");
	}
	
	public void returning(List<UserTest> list) {
		for(UserTest t : list) {
			System.out.println(t.getName());
		}
	}
	
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("======================");
		Object returnObject = pjp.proceed();
		System.out.println("======================");
		
		return returnObject;
	}
}
