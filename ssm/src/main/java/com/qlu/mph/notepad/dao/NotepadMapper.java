package com.qlu.mph.notepad.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qlu.mph.notepad.model.Notepad;
import com.qlu.mph.notepad.model.NotepadExample;

public interface NotepadMapper {
    long countByExample(NotepadExample example);

    int deleteByExample(NotepadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Notepad record);

    int insertSelective(Notepad record);

    List<Notepad> selectByExample(NotepadExample example);

    Notepad selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Notepad record, @Param("example") NotepadExample example);

    int updateByExample(@Param("record") Notepad record, @Param("example") NotepadExample example);

    int updateByPrimaryKeySelective(Notepad record);

    int updateByPrimaryKey(Notepad record);
    
    /**
	     * 插入一条帖子
	* @param tiezi
	*/
	void addNotepad(Notepad notepad);
	
	/**
	     * 查询多条记事本
	* @param tiezi
	*/
	List<Notepad> searchNotepad();
	
	void updateNotepad(Notepad notepad);

}