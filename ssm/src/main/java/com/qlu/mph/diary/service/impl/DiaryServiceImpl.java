package com.qlu.mph.diary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qlu.mph.diary.dao.DiaryMapper;
import com.qlu.mph.diary.model.Diary;
import com.qlu.mph.diary.service.DiaryService;


@Service
public class DiaryServiceImpl implements DiaryService {

	@Autowired
	private DiaryMapper diaryMapper;

	@Override
	public void addDiary(Diary diary) {
		// TODO Auto-generated method stub
		diaryMapper.addDiary(diary);

	}
	
	@Override
	public List<Diary>  searchDiary() {
		// TODO Auto-generated method stub
		return diaryMapper.searchDiary();
		
	}
	
	@Override
	public void updateDiary(Diary diary) {
		// TODO Auto-generated method stub
		diaryMapper.updateDiary(diary);
		
	}


}