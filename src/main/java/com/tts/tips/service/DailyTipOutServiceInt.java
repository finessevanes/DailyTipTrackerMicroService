package com.tts.tips.service;

import java.util.ArrayList;

import com.tts.tips.model.DailyTipOut;

public interface DailyTipOutServiceInt{
	public ArrayList<DailyTipOut> getAll();
	public void saveDailyTipOut(DailyTipOut dailyTipOut);

}
