package com.example.menu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.menu.model.UserProfile;

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
	public UserProfile getUserProfile(@PathVariable("id") String id) {
		return userMap.get(id);
	}
	
	@GetMapping("/user/all")
	public List<UserProfile> getUserProfileList(){
		return new ArrayList<UserProfile>(userMap.values());
	}
	
	@PutMapping("/user/{id}")
	public void putUserProfile(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address) {
		UserProfile userProfile = new UserProfile(id, name, phone, address);
		userMap.put(id, userProfile);
	}
	@PostMapping("/user/{id}")
	public void postUserProfile(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address) {
		
		UserProfile userProfile = userMap.get(id);
		userProfile.setName(name);
		userProfile.setPhone(phone);
		userProfile.setAddress(address);
	}
	@DeleteMapping("/user/{id}")
	public void deleteUserProfile(@PathVariable("id") String id) {
		userMap.remove(id);
	}
	
}
