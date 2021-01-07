package com.study.biz;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.study.utils.SqlSessionFactoryBean;

@Repository
public class daoTEST {
	private SqlSession mybatis;

	public daoTEST() {
		try {
			mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("asdfasdfasd");
		}
	}
	
	public List<UserTest> selectALL() {
		return mybatis.selectList("daoTest.getUserTest");
	}

}
