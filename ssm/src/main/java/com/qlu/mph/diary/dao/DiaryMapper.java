package com.qlu.mph.diary.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qlu.mph.diary.model.Diary;
import com.qlu.mph.diary.model.DiaryExample;

public interface DiaryMapper {
    long countByExample(DiaryExample example);

    int deleteByExample(DiaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Diary record);

    int insertSelective(Diary record);

    List<Diary> selectByExample(DiaryExample example);

    Diary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Diary record, @Param("example") DiaryExample example);

    int updateByExample(@Param("record") Diary record, @Param("example") DiaryExample example);

    int updateByPrimaryKeySelective(Diary record);

    int updateByPrimaryKey(Diary record);
    
    /**
	     * 插入一条日记
	* @param 
	*/
	void addDiary(Diary diary);
	
	/**
	     * 查询多条日记
	* @param 
	*/
	List<Diary> searchDiary();
	
	void updateDiary(Diary diary);
}