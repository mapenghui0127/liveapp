package com.qlu.mph.friends.service;

import java.util.List;

import com.qlu.mph.friends.model.Friends;

public interface FriendsService {

	/**
	 * 添加一条日记
	 * @param 
	 */
	public void addFriends(Friends friends);
	
	public List<Friends>  searchFriends();
}
