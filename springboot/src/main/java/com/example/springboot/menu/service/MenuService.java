package com.example.springboot.menu.service;

import java.util.List;
import java.util.Map;

import com.example.springboot.menu.vo.Menu;

public interface MenuService {

	List<Menu> selectAll();

	List<Menu> selectMenuByType(Map<String, String> param);

}
