package com.tts.tips.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.tips.model.DailyTipOut;
import com.tts.tips.service.DailyTipOutServiceImpl;

@RestController
public class MainClass {
	@Autowired
	DailyTipOutServiceImpl dailyTipOutServiceImpl;
	
	@GetMapping("/DailyTipOuts")
	public ArrayList<DailyTipOut> showAllTips() {
		return dailyTipOutServiceImpl.getAll();
	}
	
}
