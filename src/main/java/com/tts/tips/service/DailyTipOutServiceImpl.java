package com.tts.tips.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.tips.model.DailyTipOut;
import com.tts.tips.repository.DailyTipOutRepository;

@Service
public class DailyTipOutServiceImpl implements DailyTipOutServiceInt{
	@Autowired
	DailyTipOutRepository dailyTipOutRepository;

	public ArrayList<DailyTipOut> getAll() {
		return dailyTipOutRepository.findAll();
	}

}
