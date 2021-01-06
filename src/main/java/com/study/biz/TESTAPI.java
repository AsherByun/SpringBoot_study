package com.study.biz;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.study.biz.service.TESTService;

public class TESTAPI {
	
	public static void main(String[] args) {
	
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		TESTService service = new TESTService(factory.getBean(daoTEST.class));
		
		List<UserTest> list = service.getUsers();
		for (UserTest user: list) {
			System.out.println(user.getName());
		}
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudyMatching");
//		EntityManager em = emf.createEntityManager();
//		
//		EntityTransaction tx = em.getTransaction();
//		
//		try {
//			tx.begin();
//			String jpql = "select b from test1 b";
//			
//			List<JPATest> list = em.createQuery(jpql,JPATest.class).getResultList();
//			for(JPATest t:list) {
//				System.out.println(t.getName());
//			}
//			tx.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//			tx.rollback();
//		}finally {
//			em.close();
//		}
//		emf.close();
	}

}
