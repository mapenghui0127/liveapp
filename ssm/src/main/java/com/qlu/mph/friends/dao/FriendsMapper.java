package com.qlu.mph.friends.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qlu.mph.friends.model.Friends;
import com.qlu.mph.friends.model.FriendsExample;

public interface FriendsMapper {
    long countByExample(FriendsExample example);

    int deleteByExample(FriendsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Friends record);

    int insertSelective(Friends record);

    List<Friends> selectByExample(FriendsExample example);

    Friends selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Friends record, @Param("example") FriendsExample example);

    int updateByExample(@Param("record") Friends record, @Param("example") FriendsExample example);

    int updateByPrimaryKeySelective(Friends record);

    int updateByPrimaryKey(Friends record);
    
    /**
	     * 插入个人资料
	* @param 
	*/
	void addFriends(Friends friends);
	
	/**
     * 查询多条个人资料
	* @param 
	*/
	List<Friends> searchFriends();
}