package com.tts.tips.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tts.tips.model.DailyTipOut;
import com.tts.tips.service.DailyTipOutServiceImpl;

@RestController
public class MainController {
	@Autowired
	DailyTipOutServiceImpl dailyTipOutServiceImpl;
	
	
	@GetMapping("/")
	public String index() {
		return "<h1>Daily Tip Out Example</h1>";
	}
	@CrossOrigin
	@PostMapping("/tip")
	public void saveTip(@RequestBody DailyTipOut dailyTipOut) {
		dailyTipOutServiceImpl.saveDailyTipOut(dailyTipOut);
	}
	@CrossOrigin
	@GetMapping("/tips")
	public ArrayList<DailyTipOut> showAllTips() {
		return dailyTipOutServiceImpl.getAll();
	}
	@CrossOrigin
	@GetMapping("/tip/{id}")
	public DailyTipOut getTipOut(@PathVariable Long id) {
		return dailyTipOutServiceImpl.getDailyTipOutUsingId(id);
	}	
	@CrossOrigin
	@DeleteMapping("/tip/{id}")
	public void deleteDailyTipOut(@PathVariable Long id) {
		dailyTipOutServiceImpl.deleteDailyTipOutUsingId(id);
	}	
	@CrossOrigin
	@DeleteMapping("/tips")
	public void deleteDailyTipOuts() {
		dailyTipOutServiceImpl.deleteAllDailyTipOuts();
	}
	@CrossOrigin
	@PutMapping("/tip/{id}")
	public void updateDailyTipOut(@PathVariable Long id, @RequestBody DailyTipOut dailyTipOut) {
		dailyTipOutServiceImpl.updateDailyTipOut(id, dailyTipOut);
	}	
}
