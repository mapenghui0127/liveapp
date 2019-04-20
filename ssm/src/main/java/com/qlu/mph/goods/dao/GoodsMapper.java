package com.qlu.mph.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qlu.mph.goods.model.Goods;
import com.qlu.mph.goods.model.GoodsExample;

public interface GoodsMapper {
    long countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
    
    /**
     * 插入二手物品
	* @param 
	*/
	void addGoods(Goods goods);
	
	/**
     * 查询多条二手物品
	* @param 
	*/
	List<Goods> searchGoods(Goods goods);
}