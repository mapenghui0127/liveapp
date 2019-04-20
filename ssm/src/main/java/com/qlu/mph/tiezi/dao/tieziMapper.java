package com.qlu.mph.tiezi.dao;

import com.qlu.mph.tiezi.model.tiezi;
import com.qlu.mph.tiezi.model.tieziExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tieziMapper {
    long countByExample(tieziExample example);

    int deleteByExample(tieziExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(tiezi record);

    int insertSelective(tiezi record);

    List<tiezi> selectByExample(tieziExample example);

    tiezi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") tiezi record, @Param("example") tieziExample example);

    int updateByExample(@Param("record") tiezi record, @Param("example") tieziExample example);

    int updateByPrimaryKeySelective(tiezi record);

    int updateByPrimaryKey(tiezi record);
    
    /**
                * ����һ������
     * @param tiezi
     */
    void addTiezi(tiezi tiezi);
    /**
                * ��ѯ��������
     * @param tiezi
     */
    List<tiezi> searchTiezi(tiezi tiezi);
}