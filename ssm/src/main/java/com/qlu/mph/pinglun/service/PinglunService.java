package com.qlu.mph.pinglun.service;

import java.util.List;

import com.qlu.mph.pinglun.model.Pinglun;

public interface PinglunService {

	/**
	 * 添加一条评论
	 * @param 
	 */
	public void addPinglun(Pinglun pinglun);
	
	public List<Pinglun>  searchPinglun(Pinglun pinglun);
}
