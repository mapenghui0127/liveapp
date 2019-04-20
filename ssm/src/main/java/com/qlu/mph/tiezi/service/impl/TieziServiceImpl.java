package com.qlu.mph.tiezi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qlu.mph.tiezi.dao.tieziMapper;
import com.qlu.mph.tiezi.model.tiezi;
import com.qlu.mph.tiezi.service.TieziService;


@Service
public class TieziServiceImpl implements TieziService{

	@Autowired
	private tieziMapper tiezimapper;
	@Override
	public void addTiezi(tiezi tiezi) {
		// TODO Auto-generated method stub
		tiezimapper.addTiezi(tiezi);
		
	}
	
	@Override
	public List<tiezi>  searchTiezi(tiezi tiezi) {
		// TODO Auto-generated method stub
		return tiezimapper.searchTiezi(tiezi);
		
	}
	
	
	/*
	 * @ResponseBody public List<tiezi> Query() { //·µ»Ølist return list; }
	 */

}
