package com.spring.dao;

import org.mybatis.spring.SqlSessionTemplate;

public class PostspotDAO {

	private SqlSessionTemplate sessionTemplate;
	
	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) throws Exception{
		this.sessionTemplate = sessionTemplate;
	}
	
	
}
