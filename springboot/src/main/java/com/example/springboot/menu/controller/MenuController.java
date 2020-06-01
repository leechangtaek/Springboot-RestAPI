package com.example.springboot.menu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.menu.service.MenuService;
import com.example.springboot.menu.vo.Menu;

@RestController
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	@GetMapping("/menus")
	public List<Menu> selectAll(){
		return menuService.selectAll();
	}
	@GetMapping("/menus/{type}")
	public List<Menu> selectMenuByType(@PathVariable("type") String type){
		Map<String,String> param = new HashMap<>();
		param.put("type", type);
		
		return menuService.selectMenuByType(param);
	}
	
}
