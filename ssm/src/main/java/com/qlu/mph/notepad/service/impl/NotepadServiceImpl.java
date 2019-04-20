package com.qlu.mph.notepad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qlu.mph.notepad.dao.NotepadMapper;
import com.qlu.mph.notepad.model.Notepad;
import com.qlu.mph.notepad.service.NotepadService;

@Service
public class NotepadServiceImpl implements NotepadService {

	@Autowired
	private NotepadMapper notepadMapper;
	@Override
	public void addNotepad(Notepad notepad) {
		// TODO Auto-generated method stub
		notepadMapper.addNotepad(notepad);
		
	}
	
	@Override
	public List<Notepad>  searchNotepad() {
		// TODO Auto-generated method stub
		return notepadMapper.searchNotepad();
		
	}
	
	@Override
	public void updateNotepad(Notepad notepad) {
		// TODO Auto-generated method stub
		notepadMapper.updateNotepad(notepad);
		
	}
}
