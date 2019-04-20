package com.qlu.mph.pinglun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qlu.mph.pinglun.model.Pinglun;
import com.qlu.mph.pinglun.model.PinglunExample;

public interface PinglunMapper {
    long countByExample(PinglunExample example);

    int deleteByExample(PinglunExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pinglun record);

    int insertSelective(Pinglun record);

    List<Pinglun> selectByExample(PinglunExample example);

    Pinglun selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pinglun record, @Param("example") PinglunExample example);

    int updateByExample(@Param("record") Pinglun record, @Param("example") PinglunExample example);

    int updateByPrimaryKeySelective(Pinglun record);

    int updateByPrimaryKey(Pinglun record);
    
    /**
     * 插入评论
	* @param 
	*/
	void addPinglun(Pinglun pinglun);
	
	/**
     * 查询多条评论
	* @param 
	*/
	List<Pinglun> searchPinglun(Pinglun pinglun);
    
}