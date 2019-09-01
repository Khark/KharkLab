package com.bar.service;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class TserviceImpl implements Tservice {

	@Inject
	private SqlSession sqlsession;
	
	private static final String namespace = "mappers.testMapper";
	
	@Override
	public int test() {
		return sqlsession.selectOne(namespace+".selectTest");
	}

}
