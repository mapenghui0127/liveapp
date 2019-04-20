package com.qlu.mph.diary.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qlu.mph.diary.model.Diary;
import com.qlu.mph.diary.service.DiaryService;

@Controller
@CrossOrigin(origins = "*", allowedHeaders="*")
@RequestMapping("/diary")
public class DiaryController {
	
	
	@Autowired
	private DiaryService diaryService;
	
	/**
	 * ��Ӽ��±�
	 * @param 
	 */
	@RequestMapping("/add")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public void addDiary(Diary diary) {
		
		diaryService.addDiary(diary);
	}
	
	/**
	 * ��ѯ������±�
	 * @param 
	 */
	@RequestMapping("/search")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public List<Diary> searchDiary() {
		List<Diary> diaryList = new ArrayList<Diary>();
		diaryList =  diaryService.searchDiary();
		return diaryList;
	}
	
	/**
	 * �����ռ�
	 * @param 
	 */
	@RequestMapping("/update")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public void diaryNotepad(Diary diary) {
		
		diaryService.updateDiary(diary);
	}

}

