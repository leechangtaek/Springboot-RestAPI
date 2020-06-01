package com.example.springboot.menu.dao;

import java.util.List;
import java.util.Map;

import com.example.springboot.menu.vo.Menu;

public interface MenuDAO {

	List<Menu> selectAll();

	List<Menu> selectMenuByType(Map<String, String> param);

	List<Menu> selectMenuByTypeAndTaste(Map<String, String> param);

	int insertMenu(Menu menu);

	int updateMenu(Menu menu);

	int deleteMenu(int id);

	Menu selectOneMenu(int id);

}
