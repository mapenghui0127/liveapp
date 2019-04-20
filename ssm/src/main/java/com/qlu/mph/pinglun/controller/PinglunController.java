package com.qlu.mph.pinglun.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qlu.mph.pinglun.model.Pinglun;
import com.qlu.mph.pinglun.service.PinglunService;

@Controller
@CrossOrigin(origins = "*", allowedHeaders="*")
@RequestMapping("/pinglun")
public class PinglunController {
	
	
	@Autowired
	private PinglunService pinglunService;
	
	/**
	 * ���һ������
	 * @param 
	 */
	@RequestMapping("/add")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public void addPinglun(Pinglun pinglun) {
		
		pinglunService.addPinglun(pinglun);
	}
	
	/**
	 * ��ѯ�������
	 * @param 
	 */
	@RequestMapping("/search")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public List<Pinglun> searchPinglun(Pinglun pinglun) {
		List<Pinglun> pinglunList = new ArrayList<Pinglun>();
		pinglunList =  pinglunService.searchPinglun(pinglun);
		return pinglunList;
	}

}

