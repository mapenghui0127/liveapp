package com.qlu.mph.tiezi.service;

import java.util.List;

import com.qlu.mph.tiezi.model.tiezi;

public interface TieziService {

	/**
	 * ���һ������
	 * @param tiezi
	 */
	public void addTiezi(tiezi tiezi);
	
	public List<tiezi>  searchTiezi(tiezi tiezi);
	
}
