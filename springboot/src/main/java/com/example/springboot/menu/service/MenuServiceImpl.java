package com.example.springboot.menu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.menu.dao.MenuDAO;
import com.example.springboot.menu.vo.Menu;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDAO menuDAO;
	
	@Override
	public List<Menu> selectAll() {
		return menuDAO.selectAll();
	}

	@Override
	public List<Menu> selectMenuByType(Map<String, String> param) {
		return menuDAO.selectMenuByType(param);
	}

}
