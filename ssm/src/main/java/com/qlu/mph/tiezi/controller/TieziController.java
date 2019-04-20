package com.qlu.mph.tiezi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qlu.mph.tiezi.model.tiezi;
import com.qlu.mph.tiezi.service.TieziService;

@Controller
@CrossOrigin(origins = "*", allowedHeaders="*")
@RequestMapping("/tiezi")
public class TieziController {
	
	@Autowired
	private TieziService tieziService;
	
	/**
	 * ���һ������
	 * @param tiezi
	 */
	@RequestMapping("/add")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public void addTiezi(tiezi tiezi) {
		//��ʱ��װperson
		tiezi.setPerson(1);
		tieziService.addTiezi(tiezi);
	}
	
	/**
	 * ��ѯ�������
	 * @param tiezi
	 */
	@RequestMapping("/search")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public List<tiezi> searchTiezi(tiezi tiezi) {
		List<tiezi> tieziList = new ArrayList<tiezi>();
		tieziList =  tieziService.searchTiezi(tiezi);
		return tieziList;
	}
}
