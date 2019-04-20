package com.qlu.mph.friends.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qlu.mph.friends.dao.FriendsMapper;
import com.qlu.mph.friends.model.Friends;
import com.qlu.mph.friends.service.FriendsService;

@Service
public class FriendsServiceImpl implements FriendsService {

	@Autowired
	private FriendsMapper friendsMapper;

	@Override
	public void addFriends(Friends friends) {
		// TODO Auto-generated method stub
		friendsMapper.addFriends(friends);

	}
	@Override
	public List<Friends>  searchFriends() {
		// TODO Auto-generated method stub
		return friendsMapper.searchFriends();
		
	}
	
}
