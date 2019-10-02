package com.tts.tips.service;

import java.util.ArrayList;

import com.tts.tips.model.DailyTipOut;

public interface DailyTipOutServiceInt{
	
	//1
	public ArrayList<DailyTipOut> getAll();
	//2
	DailyTipOut getDailyTipOutUsingId(Long id);
	//3
	public void saveDailyTipOut(DailyTipOut dailyTipOut);
	//4
	public void deleteDailyTipOutUsingId(Long id);
	
	//5
	void updateDailyTipOut(Long id, DailyTipOut dailyTipOutChanges);
}
