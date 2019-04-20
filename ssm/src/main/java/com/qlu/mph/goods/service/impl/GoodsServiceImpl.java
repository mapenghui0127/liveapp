package com.qlu.mph.goods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qlu.mph.goods.dao.GoodsMapper;
import com.qlu.mph.goods.model.Goods;
import com.qlu.mph.goods.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public void addGoods(Goods goods) {
		// TODO Auto-generated method stub
		goodsMapper.addGoods(goods);

	}
	
	@Override
	public List<Goods>  searchGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsMapper.searchGoods(goods);
		
	}
	
	/*
	 * @Override public List<Diary> searchDiary() { // TODO Auto-generated method
	 * stub return diaryMapper.searchDiary();
	 * 
	 * }
	 */


}
