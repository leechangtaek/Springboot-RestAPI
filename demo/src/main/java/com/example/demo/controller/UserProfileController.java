package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserProfile;

@RestController 
public class UserProfileController {

	private Map<String, UserProfile> userMap;
	
	@PostConstruct
	public void init() {
		userMap = new HashMap<String, UserProfile>();
		userMap.put("1", new UserProfile("1","이창택","111-1111","경기도 안산시 고잔동"));
		userMap.put("2", new UserProfile("2","이창택","222-2222","경기도 안산시 고잔동"));
		userMap.put("3", new UserProfile("3","이창택","333-3333","경기도 안산시 고잔동"));
	}
	
	@GetMapping("/user/{id}")
	public UserProfile getUserProfie(@PathVariable("id") String id) {
		return userMap.get(id);
	}
}
