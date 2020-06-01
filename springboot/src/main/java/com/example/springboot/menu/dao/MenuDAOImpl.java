package com.example.springboot.menu.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springboot.menu.vo.Menu;

@Repository
public class MenuDAOImpl implements MenuDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<Menu> selectAll() {
		return sqlSession.selectList("menu.selectAll");
	}

	@Override
	public List<Menu> selectMenuByType(Map<String, String> param) {
		return sqlSession.selectList("menu.selectMenuByType",param);
	}
}
