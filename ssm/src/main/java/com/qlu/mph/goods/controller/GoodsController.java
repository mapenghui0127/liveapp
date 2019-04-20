package com.qlu.mph.goods.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qlu.mph.goods.model.Goods;
import com.qlu.mph.goods.service.GoodsService;

@Controller
@CrossOrigin(origins = "*", allowedHeaders="*")
@RequestMapping("/goods")
public class GoodsController {
	
	
	@Autowired
	private GoodsService goodsService;
	
	/**
	 * 添加记事本
	 * @param 
	 */
	@RequestMapping("/add")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public void addGoods(Goods goods) {
		
		goodsService.addGoods(goods);
	}
	
	/**
	 * 查询多个个人资料
	 * @param 
	 */
	@RequestMapping("/search")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public List<Goods> searchGoods(Goods goods) {
		List<Goods> goodsList = new ArrayList<Goods>();
		goodsList =  goodsService.searchGoods(goods);
		return goodsList;
	}
}

