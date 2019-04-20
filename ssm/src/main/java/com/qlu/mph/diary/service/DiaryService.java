package com.qlu.mph.diary.service;

import java.util.List;

import com.qlu.mph.diary.model.Diary;

public interface DiaryService {

	/**
	 * 添加一条日记
	 * @param 
	 */
	public void addDiary(Diary diary);
	
	public List<Diary>  searchDiary();
	
	public void updateDiary(Diary diary);
}
