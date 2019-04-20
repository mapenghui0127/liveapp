package com.qlu.mph.notepad.service;

import java.util.List;

import com.qlu.mph.notepad.model.Notepad;


public interface NotepadService {

	/**
	 * 添加一条记事本
	 * @param 
	 */
	public void addNotepad(Notepad notepad);
	
	public List<Notepad>  searchNotepad();
	
	public void updateNotepad(Notepad notepad);
}
