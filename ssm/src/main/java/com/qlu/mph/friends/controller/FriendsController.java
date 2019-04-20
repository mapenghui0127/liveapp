package com.qlu.mph.friends.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qlu.mph.friends.model.Friends;
import com.qlu.mph.friends.service.FriendsService;

@Controller
@CrossOrigin(origins = "*", allowedHeaders="*")
@RequestMapping("/friends")
public class FriendsController {
	
	
	@Autowired
	private FriendsService friendsService;
	
	/**
	 * 添加记事本
	 * @param 
	 */
	@RequestMapping("/add")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public void addFriends(Friends friends) {
		
		friendsService.addFriends(friends);
	}
	
	/**
	 * 查询多个个人资料
	 * @param 
	 */
	@RequestMapping("/search")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public List<Friends> searchFriends() {
		List<Friends> friendsList = new ArrayList<Friends>();
		friendsList =  friendsService.searchFriends();
		return friendsList;
	}

}
