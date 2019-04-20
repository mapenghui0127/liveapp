package com.qlu.mph.notepad.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qlu.mph.notepad.model.Notepad;
import com.qlu.mph.notepad.service.NotepadService;

@Controller
@CrossOrigin(origins = "*", allowedHeaders="*")
@RequestMapping("/notepad")
public class NotepadController {
	
	
	@Autowired
	private NotepadService notepadService;
	
	/**
	 * ��Ӽ��±�
	 * @param 
	 */
	@RequestMapping("/add")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public void addNotepad(Notepad notepad) {
		
		notepadService.addNotepad(notepad);
	}
	
	/**
	 * ��ѯ������±�
	 * @param 
	 */
	@RequestMapping("/search")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public List<Notepad> searchNotepad() {
		List<Notepad> notepadList = new ArrayList<Notepad>();
		notepadList =  notepadService.searchNotepad();
		return notepadList;
	}
	
	/**
	 * ���¼��±�
	 * @param 
	 */
	@RequestMapping("/update")
	@ResponseBody
	@CrossOrigin(origins = "*", allowedHeaders="*")
	public void updateNotepad(Notepad notepad) {
		
		notepadService.updateNotepad(notepad);
	}

}
