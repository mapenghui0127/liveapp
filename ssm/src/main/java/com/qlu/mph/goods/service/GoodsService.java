package com.qlu.mph.goods.service;

import java.util.List;

import com.qlu.mph.goods.model.Goods;

public interface GoodsService {

	/**
	 * 添加一条日记
	 * @param 
	 */
	public void addGoods(Goods goods);
	
	public List<Goods>  searchGoods(Goods goods);
}
