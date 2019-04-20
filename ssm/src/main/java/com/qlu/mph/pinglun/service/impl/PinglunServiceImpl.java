package com.qlu.mph.pinglun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qlu.mph.pinglun.dao.PinglunMapper;
import com.qlu.mph.pinglun.model.Pinglun;
import com.qlu.mph.pinglun.service.PinglunService;

@Service
public class PinglunServiceImpl implements PinglunService {

	@Autowired
	private PinglunMapper pinglunMapper;

	@Override
	public void addPinglun(Pinglun pinglun) {
		// TODO Auto-generated method stub
		pinglunMapper.addPinglun(pinglun);

	}
	
	@Override
	public List<Pinglun>  searchPinglun(Pinglun pinglun) {
		// TODO Auto-generated method stub
		return pinglunMapper.searchPinglun(pinglun);
		
	}
	
	
	
	/*
	 * @Override public List<Diary> searchDiary() { // TODO Auto-generated method
	 * stub return diaryMapper.searchDiary();
	 * 
	 * }
	 */


}

